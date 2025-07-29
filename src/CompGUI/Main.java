package CompGUI;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        // Establecer la apariencia del sistema
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Crear e iniciar la ventana de login
        SwingUtilities.invokeLater(() -> {
            Login loginFrame = new Login();
            loginFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            loginFrame.setVisible(true);
        });
    }
}
