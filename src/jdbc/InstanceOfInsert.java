package jdbc;

import java.sql.*;

public class InstanceOfInsert {
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
            try (PreparedStatement ps = conn.prepareStatement("INSERT INTO students (id, grade, name, gender, score) Values (?, ?, ?, ?, ?)")) {
                ps.setObject(1, 999);
                ps.setObject(2, 1);
                ps.setObject(3, "Harry");
                ps.setObject(4 ,1);
                ps.setObject(5, 60);
                int n = ps.executeUpdate();
                if (n > 0) {
                    System.out.println("成功插入 " + n + " 条记录！");
                } else {
                    System.out.println("没有插入任何记录！");
                }
                try (ResultSet rs = ps.getGeneratedKeys()) {
                    if (rs.next()) {
                        long id = rs.getLong(1);
                        System.out.println("ID是 " + id + "！");
                    }
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
