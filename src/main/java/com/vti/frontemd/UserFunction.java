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
            System.out.println("1. Tim kiem employee theo project id ");
            System.out.println("2. Hien thi danh sach manager ");
            System.out.println("3. Dang nhap danh cho manager ");
            System.out.println("4. Thoat chuong trinh ");
            System.out.println("Moi ban chon chuc nang : ");
            int menu = ScannerUtil.inputInt();
            if(menu == 1){
                findEmployeeByProjectId();
            } else if(menu == 2){
                findAllManager();
            } else if (menu == 3) {
                findManagerByEmailAndPassword();
            } else if (menu == 4) {
                System.out.println("Cam on ban da su dung chuong trinh ");
                return;
            }else {
                System.out.println("Vui long nhap lai chuc nang ");
            }
        }
    }
    private void findEmployeeByProjectId()  {
        System.out.println("Nhap vao projectId : ");
        int projectId = ScannerUtil.inputInt();
        List<User> users = controller.findEmployeeByProjectId(projectId);
        System.out.println("+------+-------------------------+-------------------------+");
        System.out.printf("| %-4s | %-23s | %-23s |%n","ID", "FULLNAME", "EMAIL");
        System.out.println("+------+-------------------------+-------------------------+");
        if (users.isEmpty()) {
            System.out.printf("| %-4s | %-23s | %-23s |%n", "NULL", "NULL", "NULL");
            System.out.println("+------+-------------------------+-------------------------+");
        } else {
            for (User user : users) {
                System.out.printf(
                        "| %-4s | %-23s | %-23s |%n",
                        user.getId(), user.getFullName(), user.getEmail()
                );
                System.out.println("+------+-------------------------+-------------------------+");
            }
        }
    }

    public void findAllManager()   {
        List<User> users = controller.findAllManager();
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

    private void findManagerByEmailAndPassword()  {
        System.out.println("Nhap vao email : ");
        String email = ScannerUtil.inputEmail();
        System.out.println("nhap vao password : ");
        String password = ScannerUtil.inputPassword();
        User user = controller.findManagerByEmailAndPassword(email, password);
        if(user == null){
            System.out.println("Dang nhap that bai");
        }else {
            User.Role role = user.getRole();
            System.out.printf("Dang nhap thanh cong %s - %s%n",
                    user.getFullName(),role
            );

        }
    }
}
