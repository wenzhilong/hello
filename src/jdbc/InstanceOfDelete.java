package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InstanceOfDelete {
    public static void main(String[] args) {
        String JDBC_URL = "jdbc:mysql://127.0.0.1:3306/learnjdbc?characterEncoding=UTF-8";
        String JDBC_USER = "root";
        String JDBC_PASSWORD = "123456";

        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        try (Connection conn = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD)) {
            try (PreparedStatement ps = conn.prepareStatement("DELETE FROM students WHERE id=?")) {
                ps.setObject(1, 999); // 索引从1开始
                int n = ps.executeUpdate(); // 删除的行数
                if (n > 0) {
                    System.out.println("成功删除 " + n + " 条记录！");
                } else {
                    System.out.println("没有任何记录被删除！");
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
