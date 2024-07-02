package com.vti.repository;

import com.vti.entity.User;
import com.vti.util.JdbcUtil;

import java.io.IOException;
import java.sql.*;
import java.util.LinkedList;
import java.util.List;

public class UserRepository implements IUserRepository {
    /**
     * @param
     * @return tra ve tat ca user trong database
     * @throws SQLException neu xay ra loi ve SQL
     * @throws IOException neu xay ra loi ve cau hinh
     * */
    @Override
    public List<User> findEmployeeAndManagerByProjectId(int projectId) throws SQLException, IOException {
        String sql = "SELECT * FROM users WHERE role IN('EMPLOYEE', 'MANAGER') AND project_id = ?";
        try (
                Connection connection = JdbcUtil.getConnection();
                Statement stmt = connection.createStatement();
                ResultSet rs = stmt.executeQuery(sql)
        ){
            List<User> users = new LinkedList<>();
            while (rs.next()){
                User user = getUser(rs);
                users.add(user);
            }
            return users;
        }
    }
    @Override
    public User findAdminByEmailAndPassword(String email, String password) throws SQLException,IOException {
        String sql = "{CALL find_admin_by_email_and_password ( ?, ?)}";
        try(
                Connection connection = JdbcUtil.getConnection();
                PreparedStatement stmt = connection.prepareStatement(sql)
                ){
            stmt.setString(1,email);
            stmt.setString(2,password);
            try(ResultSet rs = stmt.executeQuery()){
                List<User> users = new LinkedList<>();
                while (rs.next()) {
                    User user = getUser(rs);
                    users.add(user);
                }
                return users;
            }
        }
    }
    @Override
    public int create(String fullName, String email)throws SQLException , IOException{
        String sql = "INSERT INTO users(full_name, email) VALUE (?, ?)";
        try(
                Connection connection = JdbcUtil.getConnection();
                PreparedStatement pStmt = connection.prepareStatement(sql)
                ){
            pStmt.setString(1,fullName);
            pStmt.setString(2,email);
            return pStmt.executeUpdate();

        }
    }
    private User getUser(ResultSet rs) throws SQLException {
        User user = new User();
        user.setId(rs.getInt("id"));
        user.setFullName(rs.getString("full_name"));
        user.setEmail(rs.getString("email"));
        user.setPassword(rs.getString("password"));
        user.setRole(rs.getString("role"));
        user.setProSkill(rs.getString("pro_skill"));
        user.setProjectId(rs.getInt("project_id"));
        user.setExpInYear(rs.getInt("exp_in_year"));
        return user;
    }

}
