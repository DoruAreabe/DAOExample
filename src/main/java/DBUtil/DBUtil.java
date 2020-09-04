package DBUtil;

import java.sql.*;

public class DBUtil {
    private static final String DBLogin="root";
    private static final String DBpassword="coderslab";
    private static final String DBUrl="jdbc:mysql://localhost:3306/UserDB?serverTimezone=UTC";

    public static Connection getConection() throws SQLException {
        Connection con = DriverManager.getConnection(DBUrl,DBLogin,DBpassword);
        return con;
    }
    public static ResultSet DBSelect (PreparedStatement preStatement) throws SQLException {
        Connection con = DBUtil.getConection();
        return preStatement.executeQuery();
    }
    public static int DBOther(PreparedStatement preStatement) throws SQLException {
        Connection con = DBUtil.getConection();
        return preStatement.executeUpdate();
    }
}
