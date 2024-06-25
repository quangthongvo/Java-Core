package frontend;

import com.vti.util.ScannerUtil;
import entity.User;
import repository.UserRepository;

import java.sql.SQLException;
import java.util.List;

public class UserFunsition {
    private UserRepository repository;

    public void showMenu() throws SQLException {
        while (true) {
            System.out.println("1. Hien thi danh sach uesr");
            System.out.println("2. Them user");
            System.out.println("3. thoat chuong trinh ");
            System.out.println("Moi ban chon chuc nang");
            int menu = ScannerUtil.inputInt();
            if (menu == 1){
                findAll();
            } else if (menu == 2){
                System.out.println("Cam on ban da su dung chuong trinh");
            }else {
                System.out.println("Vui long chon dung chuc nang");
            }

        }
    }

    public void findAll() throws SQLException {
        List<User> users = repository.findAll();
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
    private void create(){
        System.out.println("Moi ban nhap vao user");
        System.out.println("Nhap vao fullname");
        String fullName = ScannerUtil.inputFullName();
        System.out.println("Nhap vao email");
        String email = ScannerUtil.inputEmail();
        int result = repository.create(fullName, email);

    }
}

