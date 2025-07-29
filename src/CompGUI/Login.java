package CompGUI;

import BD.ConexionBD;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends JFrame {

    private JTextField usernameField;
    private JPasswordField passwordField;
    private JButton loginButton;

    public Login() {
        // Configuración de la ventana
        setTitle("Login");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Centrar la ventana

        // Crear panel para la interfaz
        JPanel panel = new JPanel();
        add(panel);
        placeComponents(panel);

        setVisible(true); // Mostrar la ventana
    }

    private void placeComponents(JPanel panel) {
        panel.setLayout(null);

        JLabel userLabel = new JLabel("Usuario:");
        userLabel.setBounds(10, 20, 80, 25);
        panel.add(userLabel);

        usernameField = new JTextField(20);
        usernameField.setBounds(100, 20, 165, 25);
        panel.add(usernameField);

        JLabel passwordLabel = new JLabel("Contraseña:");
        passwordLabel.setBounds(10, 50, 80, 25);
        panel.add(passwordLabel);

        passwordField = new JPasswordField(20);
        passwordField.setBounds(100, 50, 165, 25);
        panel.add(passwordField);

        loginButton = new JButton("Iniciar Sesión");
        loginButton.setBounds(10, 80, 255, 25);
        panel.add(loginButton);

        // Manejo del botón de inicio de sesión
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Aquí puedes manejar la acción de inicio de sesión
                System.out.println("Iniciando sesión para: " + usernameField.getText());
            }
        });
    }

    public static void main(String[] args) {
        new Login(); // Crear y mostrar la ventana
    }
}
