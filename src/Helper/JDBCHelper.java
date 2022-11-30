
package Helper;

import java.sql.*;
public class JDBCHelper {
   static String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
   static String url = "jdbc:sqlserver://127.0.0.1:1433;databaseName=UPCOFFEE";
//   static String user ="admin";
//   static String password ="12345";
   static String user ="sa";
   static String password ="123456";
    
     static {
        try {
            Class.forName(driver);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static PreparedStatement getStmt(String sql, Object... args) throws Exception {
        Connection con = DriverManager.getConnection(url, user, password);//kết nối
        PreparedStatement stmt;
        if (sql.trim().startsWith("{")) {
            stmt = con.prepareCall(sql);//câu lệnh SQl là thủ tục
        } else {
            stmt = con.prepareStatement(sql);//câu lệnh sql select
        }

        for (int i = 0; i < args.length; i++) {//i = 0 suy ra câu truy vấn không có ?
            stmt.setObject(i + 1, args[i]);//đẩy dữ liệu vào dấu ?
        }
        return stmt;
    }

    public static ResultSet query(String sql, Object... args) throws Exception {
        PreparedStatement stmt = JDBCHelper.getStmt(sql, args);
        return stmt.executeQuery();//trả về rs "preparestatement có thể chạy executeQuery"
    }

    public static Object value(String sql, Object... args) {//trả về Mã mỗi bảng
        try {
            ResultSet rs = JDBCHelper.query(sql, args);
            if (rs.next()) {
                return rs.getObject(0);
            }//nếu có dữ liệu sẽ không đóng rs nếu đóng không trả đc rs
            rs.getStatement().getConnection().close();
            return null;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static int update(String sql, Object... args) {
        try {
            PreparedStatement stmt = JDBCHelper.getStmt(sql, args);
            try {
                return stmt.executeUpdate();
            } finally {
                stmt.getConnection().close();
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
