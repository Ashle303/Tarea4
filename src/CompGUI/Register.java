package CompGUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Register extends JFrame {

    private JTextField usernameField;
    private JPasswordField passwordField;
    private JPasswordField confirmPasswordField;

    public Register () {
        setTitle("Registro");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(4, 2));

        // Campos de texto
        add(new JLabel("Usuario:"));
        usernameField = new JTextField();
        add(usernameField);

        add(new JLabel("Contraseña:"));
        passwordField = new JPasswordField();
        add(passwordField);

        add(new JLabel("Confirma Contraseña:"));
        confirmPasswordField = new JPasswordField();
        add(confirmPasswordField);

        // Botón de registro
        JButton registerButton = new JButton("Registrar");
        registerButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                registrar();
            }
        });
        add(registerButton);

        setVisible(true);
    }

    private void registrar() {
        String username = usernameField.getText();
        String password = new String(passwordField.getPassword());
        String confirmPassword = new String(confirmPasswordField.getPassword());

        if(password.equals(confirmPassword)) {
            JOptionPane.showMessageDialog(this, "Registro Exitoso!");
        } else {
            JOptionPane.showMessageDialog(this, "Las contraseñas no coinciden.");
        }
    }

    public static void main(String[] args) {
        new Register();
    }
}
