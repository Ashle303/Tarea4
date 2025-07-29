package BD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBD {
    private static final String URL = "jdbc:mysql://localhost:3306/tu_base_de_datos"; // Cambia 'tu_base_de_datos'
    private static final String USER = "tu_usuario"; // Cambia 'tu_usuario'
    private static final String PASSWORD = "tu_contraseña"; // Cambia 'tu_contraseña'

    private Connection connection;

    public ConexionBD() {
        try {
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Conexión establecida con éxito.");
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Error al establecer la conexión.");
        }
    }

    public Connection getConnection() {
        return connection;
    }

    public void closeConnection() {
        try {
            if (connection != null && !connection.isClosed()) {
                connection.close();
                System.out.println("Conexión cerrada.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
