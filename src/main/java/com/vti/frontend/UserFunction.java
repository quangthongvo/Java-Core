package com.vti.frontend;


import com.vti.entity.User;
import com.vti.repository.UserRepository;
import com.vti.util.ScannerUtil;
import lombok.AllArgsConstructor;
import java.sql.SQLException;

@AllArgsConstructor
public class UserFunction {
    private UserRepository repository;
    public void showMenu() throws SQLException {
        while (true){
            System.out.println("1. Tim kiem User theo profile_id ");
            System.out.println("2. Thoat chuong trinh ");
            System.out.println("Moi ban chon chuc nang ");
            int menu = ScannerUtil.inputInt();
            if(menu == 1){
                findByProfileId();
            } else if (menu == 2) {
                System.out.println("Cam on ban da su dung chuong trinh");
                return;
            }else {
                System.out.println("Vui long chon dung chuc nang");
            }
        }
    }
    private void findByProfileId() throws SQLException {
        System.out.println("Nhap vao project_id");
        int projectId = ScannerUtil.inputInt();
        User user = repository.findByProjectId(projectId);
        System.out.println("+-------------------------+-------------------------+-------------------------+-------------------------+");
        System.out.printf("| %-23s | %-23s | %-23s | %-23s |%n", "PROJECT ID", "FULL NAME", "EMAIL","ROLE");
        System.out.println("+-------------------------+-------------------------+-------------------------+-------------------------+");
        if(user == null){
            System.out.printf("| %-23s | %-23s | %-23s | %-23s |%n", "NULL", "NULL", "NULL","NULL");
            System.out.println("+-------------------------+-------------------------+-------------------------+-------------------------+");
        }else {
            System.out.printf(
                    "| %-23s | %-23s | %-23s | %-23s |%n",
                    user.getProjectId(), user.getFullName(), user.getEmail(),user.getRole()
            );
            System.out.println("+-------------------------+-------------------------+-------------------------+-------------------------+");
        }
    }
}
