package com.vti.frontemd;

import com.vti.controller.UserController;
import com.vti.entity.User;
import com.vti.util.ScannerUtil;
import lombok.AllArgsConstructor;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

@AllArgsConstructor
public class UserFunction {
    private UserController controller;

    public void showMenu()  {
        while (true) {
            System.out.println("1. Dang nhap ");
            System.out.println("2. Hien thi danh sach user ");
            System.out.println("3. Tim kiem user theo chuong trinh ");
            System.out.println("4. Thoat chuong trinh ");
            System.out.println("Moi ban chon chuc nang : ");
            int menu = ScannerUtil.inputInt();
            if(menu == 1){
                findAdminByEmailAndPassword();
            } else if(menu == 2){
                findEmployeeAndManagerByprojectId();
            } else if (menu == 3) {
                findById();
            } else if (menu == 4) {
                System.out.println("Cam on ban da su dung chuong trinh ");
                return;
            }else {
                System.out.println("Vui long nhap lai chuc nang ");
            }
        }
    }
    private void showAdminMenu() {
        while (true) {
            System.out.println("1. Hien thi danh sach user ");
            System.out.println("2. Tim kiem user theo chuong trinh ");
            System.out.println("3. Them user");
            System.out.println("4. Xoa user theo id");
            System.out.println("5. Dang xuat ");
            System.out.println("Moi ban chon chuc nang : ");
            int menu = ScannerUtil.inputInt();
            if(menu == 1){
                findEmployeeAndManagerByprojectId();
            } else if (menu == 2) {
                findById();
            } else if (menu == 3) {
                create();
            } else if (menu == 4) {
                deleteById();
            } else if (menu == 5) {
                System.out.println("Cam on ban da su dung chuong trinh ");
                return;
            }else {
                System.out.println("Vui long nhap lai chuc nang ");
            }
        }

    }
    private void showEmployeeMenu() {
        while (true) {
            System.out.println("1. Hien thi danh sach user ");
            System.out.println("2. Tim kiem user theo chuong trinh ");
            System.out.println("3. Dang xuat ");
            System.out.println("4. Thoat chuong trinh ");
            System.out.println("Moi ban chon chuc nang : ");
            int menu = ScannerUtil.inputInt();
            if(menu == 1){
                findEmployeeAndManagerByprojectId();
            } else if (menu == 2) {
                findById();
            } else if (menu == 3) {
                System.out.println("Cam on ban da su dung chuong trinh ");
                return;
            }else {
                System.out.println("Vui long nhap lai chuc nang ");
            }
        }

    }

    public void findEmployeeAndManagerByprojectId()   {
        System.out.println("Nhap vao project id");
        int projectId = ScannerUtil.inputInt();
        List<User> users = controller.findEmployeeAndManagerByprojectId(projectId);
        System.out.println("+------+-------------------------+-------------------------+");
        System.out.printf("| %-4s | %-23s | %-23s |%n","ID", "FULLNAME", "EMAIL");
        System.out.println("+------+-------------------------+-------------------------+");
        if(users.isEmpty()){
            System.out.printf("| %-4s | %-23s | %-23s |%n","NULL", "NULL", "NULL");
            System.out.println("+------+-------------------------+-------------------------+");
        }else{
            for(User user : users){
                System.out.printf(
                        "| %-4s | %-23s | %-23s |%n", user.getId(), user.getFullName(), user.getEmail()
                );
                System.out.println("+------+-------------------------+-------------------------+");
            }
        }
    }
    private void findById()  {
        System.out.println("Nhap vao id : ");
        int id = ScannerUtil.inputInt();
        User user = controller.findById(id);
        System.out.println("+------+-------------------------+-------------------------+");
        System.out.printf("| %-4s | %-23s | %-23s |%n","ID", "FULLNAME", "EMAIL");
        System.out.println("+------+-------------------------+-------------------------+");
        if(user == null){
            System.out.printf("| %-4s | %-23s | %-23s |%n","NULL", "NULL", "NULL");
            System.out.println("+------+-------------------------+-------------------------+");
        }else {
            System.out.printf(
                    "| %-4s | %-23s | %-23s |%n", user.getId(), user.getFullName(), user.getEmail()
            );
            System.out.println("+------+-------------------------+-------------------------+");
        }
    }
    private void findAdminByEmailAndPassword()  {
        System.out.println("Nhap vao email : ");
        String email = ScannerUtil.inputEmail();
        System.out.println("nhap vao password : ");
        String password = ScannerUtil.inputPassword();
        User user = controller.findAdminByEmailAndPassword(email, password);
        if(user == null){
            System.out.println("Dang nhap that bai");
        }else {
            User.Role role = user.getRole();
            System.out.printf("Dang nhap thanh cong %s - %s%n",
                    user.getFullName(),role
            );
            if (role == User.Role.ADMIN){
                showAdminMenu();
            } else if (role == User.Role.EMPLOYEE) {
                showEmployeeMenu();
            }
        }
    }
    private void deleteById()  {
        System.out.println("Nhap vao id : ");
        int id = ScannerUtil.inputInt();
        int result = controller.deleteById(id);
        System.out.printf("Da xoa thanh cong %d user.%n",result);
    }

    private void create()  {
        System.out.println("Moi ban nhap vao thong tin User");
        System.out.println("Nhap vao full name");
        String fullName = ScannerUtil.inputFullName();
        System.out.println("Nhap vao email");
        String email = ScannerUtil.inputEmail();
        int result = controller.create(fullName, email);
        System.out.printf("Dat tao thanh cong %d user.%n " ,result);
    }

}
