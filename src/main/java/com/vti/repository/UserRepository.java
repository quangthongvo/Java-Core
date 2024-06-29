package com.vti.repository;

import com.vti.entity.User;
import com.vti.util.JdbcUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserRepository {
    public User findByProjectId(int project_id) throws SQLException {
        String sql = "SELECT * FROM users WHERE project_id = ?";
        try(
                Connection connection = JdbcUtil.getConnection();
                PreparedStatement pStmt = connection.prepareStatement(sql);
                ){
            pStmt.setInt(1,project_id);
            try(ResultSet rs = pStmt.executeQuery()){
                return rs.next() ? getUser(rs) : null;
                }
            }
        }
    private User getUser(ResultSet rs) throws SQLException {
        User user = new User();
        user.setId(rs.getInt("id"));
        user.setFullName(rs.getString("full_name"));
        user.setEmail(rs.getString("email"));
        user.setPassword(rs.getString("password"));
        user.setRole(rs.getString("role"));
        user.setProjectId(rs.getInt("project_id"));
        user.setProSkill(rs.getString("pro_skill"));
        user.setExpInYear(rs.getInt("exp_in_year"));
        return user;
    }
}
