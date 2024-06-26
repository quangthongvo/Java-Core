package com.vti.frontemd;

import com.vti.repository.UserRepository;
import com.vti.util.JdbcUtil;

import java.sql.SQLException;

public class UserProgram {
    public static void main(String[] args)throws SQLException {
        UserRepository repository = new UserRepository();
        UserFunction function = new UserFunction(repository);
        function.showMenu();
    }
}
