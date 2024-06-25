package frontend;

import com.vti.util.JdbcUtil;

import java.sql.SQLException;

public class UserProgram {
    public static void main(String[] args) throws SQLException {
        JdbcUtil.checkConnection();
    }
}
