package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class InstanceOfConnection {
    public static void main(String[] args) {
        getConnection();

    }

    public static void getConnection() {
        String JDBC_URL = "jdbc:mysql://127.0.0.1:3306/learnjdbc?characterEncoding=UTF-8";
        String JDBC_USER = "root";
        String JDBC_PASSWORD = "123456";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD);
            System.out.println("连接成功，获取连接对象：" + conn);
        } catch (ClassNotFoundException |SQLException e) {
            e.printStackTrace();
        }

    }
}
