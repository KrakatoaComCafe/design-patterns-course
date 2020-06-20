package cap1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

    public Connection getConnection() {
        try {
            String tipoDoBanco = System.getenv("tipoBanco");
            return DriverManager.getConnection("jdbc::"+tipoDoBanco+"://localhost/banco", "root", "123");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
