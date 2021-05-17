package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InstanceOfUpdate {
    public static void main(String[] args) {
        String JDBC_URL = "jdbc:mysql://127.0.0.1:3306/learnjdbc?characterEncoding=UTF-8";
        String JDBC_USER = "root";
        String JDBC_PASSWORD = "123456";

        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        try (Connection conn = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD)){
            try (PreparedStatement ps = conn.prepareStatement("UPDATE students SET name=? WHERE id=?")) {
                ps.setObject(1, "Harry Potter");
                ps.setObject(2, 999);
                int n = ps.executeUpdate();
                if (n > 0) {
                    System.out.println("成功更新 " + n + " 条记录！");
                } else {
                    System.out.println("没有任何记录被修改！");
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
