package com.vti.frontend;

import com.vti.entity.User;
import com.vti.repository.UserRepository;
import com.vti.util.ScannerUtil;
import lombok.AllArgsConstructor;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

@AllArgsConstructor
public class UserFunction {
    private UserRepository repository;
    public void showMenu() throws SQLException, IOException {
        while (true) {
            System.out.println("1. Tìm kiếm employee theo project id");
            System.out.println("2. Hiển thị danh sách manager");
            System.out.println("3. Đăng nhập dành cho manager");
            System.out.println("4. Thoát chương trình");
            System.out.println("Mời bạn chọn chức năng:");
            int menu = ScannerUtil.inputInt();
            if (menu == 1) {
                findEmployeeByProjectId();
            } else if (menu == 2) {
                findAllManager();
            } else if (menu == 3) {
                findManagerByEmailAndPassword();
            } else if (menu == 4) {
                System.out.println("Cảm ơn bạn đã sử dụng chương trình!");
                return;
            } else {
                System.err.println("Vui lòng chọn đúng chức năng.");
            }
        }
    }

    private void findAllManager() throws SQLException, IOException {
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

    private void findEmployeeByProjectId() throws SQLException, IOException {
        System.out.println("Nhập vào project id:");
        int projectId = ScannerUtil.inputInt();
        List<User> users = repository.findEmployeeByProjectId(projectId);
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

    private void findManagerByEmailAndPassword() throws SQLException, IOException {
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