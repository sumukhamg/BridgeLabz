package order_food;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class DatabaseConnection {
    private static DatabaseConnection dbConnection;
    private Connection connection;

    private final String url = "jdbc:mysql://localhost:3306/mydb";
    private final String user = "root";
    private final String password = "sqlsql";

    Connection conn = null;
    Statement stmt = null;
    ResultSet rs = null;

    private DatabaseConnection() {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            this.connection = DriverManager.getConnection(url, user, password);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    public Connection getConnection() {
        return connection;
    }

    public static DatabaseConnection getInstance() {
        if (dbConnection == null)
            dbConnection = new DatabaseConnection();
        return dbConnection;
    }

}
