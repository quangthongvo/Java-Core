package com.vti.frontend;



import java.io.IOException;
import java.sql.SQLException;

import com.vti.repository.UserRepository;
import com.vti.util.JdbcUtil;
public class USerProgram {
    public static void main(String[] args)throws SQLException,IOException {
        UserRepository repository = new UserRepository();
        UserFunction function = new UserFunction(repository);
        function.showMenu();
    }
}
