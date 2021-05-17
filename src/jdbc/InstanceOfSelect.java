package jdbc;

import java.sql.*;

public class InstanceOfSelect {
    public static void main(String[] args) {
        String JDBC_URL = "jdbc:mysql://localhost:3306/learnjdbc?useSSL=false&characterEncoding=utf8";
        String JDBC_USER = "root";
        String JDBC_PASSWORD = "123456";

        // 获取连接：
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        try (Connection conn = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD);) {
            try (PreparedStatement ps = conn.prepareStatement("SELECT id, grade, name, gender FROM students WHERE gender=? AND grade=?")){
                ps.setObject(1, "M");
                ps.setObject(2, 3);
                try (ResultSet rs = ps.executeQuery()) {
                    while (rs.next()) {
                        long id = rs.getLong("id");
                        long grade = rs.getLong("grade");
                        String name = rs.getString("name");
                        String gender = rs.getString("gender");
                        System.out.printf("%4s%4s%4s%4s", id, grade, name, gender);
                    }
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
