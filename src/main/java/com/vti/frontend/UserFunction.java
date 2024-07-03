package com.vti.frontend;


import com.vti.entity.User;
import com.vti.repository.UserRepository;
import com.vti.util.JdbcUtil;
import com.vti.util.ScannerUtil;
import lombok.AllArgsConstructor;
import java.sql.SQLException;
import java.util.List;

@AllArgsConstructor
public class UserFunction {
    private UserRepository repository;

    public void showMenu() throws SQLException {
        while (true) {
            System.out.println("1. Tim kiem User theo profile_id ");
            System.out.println("2. Hien thi danh sach manager ");
            System.out.println("3. Dang nhap danh cho manager ");
            System.out.println("4. Thoat chuong trinh ");
            System.out.println("Moi ban chon chuc nang ");
            int menu = ScannerUtil.inputInt();
            if (menu == 1) {
                findByProjectId();
            } else if (menu == 2) {
                findAllManager();
            } else if (menu == 3) {
                findManagerByEmailAndPassword();
            } else if (menu == 4) {
                System.out.println("Cam on ban da su dung chuong trinh");
                return;
            } else {
                System.out.println("Vui long chon dung chuc nang");
            }
        }
    }

    private void findByProjectId() throws SQLException {
        System.out.println("Nhập vào project id:");
        int projectId = ScannerUtil.inputInt();
        List<User> users = repository.findByProjectId(projectId);
        System.out.println("+------+-------------------------+-------------------------+");
        System.out.printf("| %-4s | %-23s | %-23s |%n", "ID", "FULL NAME", "EMAIL");
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

    private void findAllManager() throws SQLException {
        List<User> users = repository.findAllManager();
        System.out.println("+------+-------------------------+-------------------------+");
        System.out.printf("| %-4s | %-23s | %-23s |%n", "ID", "FULL NAME", "EMAIL");
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
    private void findManagerByEmailAndPassword() throws SQLException {
        System.out.println("Nhập vào email:");
        String email = ScannerUtil.inputEmail();
        System.out.println("Nhập vào password:");
        String password = ScannerUtil.inputPassword();
        User user = repository.findManagerByEmailAndPassword(email, password);
        if (user == null) {
            System.err.println("Đăng nhập thất bại!");
        } else {
            User.Role role = user.getRole();
            System.out.printf(
                    "Đăng nhập thành công: %s - %s%n",
                    user.getFullName(), role
            );
        }
    }
}
