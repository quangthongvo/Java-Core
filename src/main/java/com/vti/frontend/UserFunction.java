package com.vti.frontend;


import com.vti.entity.User;
import com.vti.repository.UserRepository;
import com.vti.util.ScannerUtil;
import lombok.AllArgsConstructor;
import java.sql.SQLException;
import java.util.List;

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
                findByProjectId();
            } else if (menu == 2) {
                System.out.println("Cam on ban da su dung chuong trinh");
                return;
            }else {
                System.out.println("Vui long chon dung chuc nang");
            }
        }
    }
    private void findByProjectId() throws SQLException {
        System.out.println("Vui lòng nhập project Id cần tìm");
        int projectId = ScannerUtil.inputInt();
        User user = repository.findByProjectId(projectId);
        System.out.println("Danh sách Employee user");
        System.out.println("+--------+--------------------+--------------------+--------------------+--------------------+");
        System.out.println("|   ID   |       EMAIL        |      FULL NAME     |         ROLE       |      PRO SKILLS    |");
        System.out.println("+--------+--------------------+--------------------+--------------------+--------------------+");
        if (user == null) {
            System.out.printf("| %-6s | %-18s | %-18s | %-18s | %-18s |%n", "NULL", "NULL", "NULL", "NULL", "NULL");
            System.out.println("+--------+--------------------+--------------------+--------------------+--------------------+");
        } else {
                System.out.printf("| %-6s | %-18s | %-18s | %-18s | %-18s |%n",
                        user.getId(), user.getFullName(), user.getEmail(), user.getRole(), user.getProSkill());
                System.out.println("+--------+--------------------+--------------------+--------------------+--------------------+");
            }
        }
    }
