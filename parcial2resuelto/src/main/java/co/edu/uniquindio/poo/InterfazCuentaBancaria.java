package co.edu.uniquindio.poo;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.*;

/**
 * Interfaz gráfica para una aplicación de gestión de cuentas bancarias.
 * Permite iniciar sesión, crear cuentas bancarias y realizar operaciones
 * como depositar y retirar dinero.
 */
public class InterfazCuentaBancaria extends JFrame {

    private JTextField usernameField;
    private JPasswordField passwordField;
    private JButton loginButton;

    private JTextField titularField;
    private JTextField numeroCuentaField;
    private JTextField saldoField;
    private JTextField estadoField;
    private JButton crearCuentaButton;

    /**
     * Constructor de la clase InterfazCuentaBancaria.
     * Configura la interfaz gráfica y los componentes.
     */
    public InterfazCuentaBancaria(){
        // Configuración de la ventana principal
        this.setSize(600, 400);
        this.setTitle("¡Bienvenido al Banco Increíble!");
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        // Fondo de pantalla
        JLabel background = new JLabel(new ImageIcon("background.jpg"));
        background.setLayout(new GridBagLayout());
        this.setContentPane(background);

        // Panel para el inicio de sesión
        JPanel loginPanel = new JPanel();
        loginPanel.setOpaque(false);
        loginPanel.setLayout(new GridBagLayout());
        GridBagConstraints loginGbc = new GridBagConstraints();
        loginGbc.gridx = 0;
        loginGbc.gridy = 0;
        loginGbc.gridwidth = 2;
        loginGbc.fill = GridBagConstraints.HORIZONTAL;
        loginGbc.insets = new Insets(10, 10, 10, 10);

        // Componentes para el inicio de sesión
        JLabel usernameLabel = new JLabel("Usuario:");
        usernameLabel.setForeground(Color.BLACK);
        usernameField = new JTextField(15);
        JLabel passwordLabel = new JLabel("Contraseña:");
        passwordLabel.setForeground(Color.BLACK);
        passwordField = new JPasswordField(15);
        loginButton = new JButton("Iniciar Sesión");
        loginButton.setBackground(new Color(51, 153, 255));
        loginButton.setForeground(Color.WHITE);
        loginButton.setFocusPainted(false);

        // Acción para el botón de inicio de sesión
        loginButton.addActionListener(e -> {
            String username = usernameField.getText();
            String password = new String(passwordField.getPassword());
            if (verificarCredenciales(username, password)) {
                loginPanel.removeAll();
                loginPanel.revalidate();
                loginPanel.repaint();
                mostrarCrearCuenta();
            } else {
                JOptionPane.showMessageDialog(this, "Usuario o contraseña incorrectos", "Error", JOptionPane.ERROR_MESSAGE);
            }
        });

        // Agregar componentes al panel de inicio de sesión
        loginPanel.add(usernameLabel, loginGbc);
        loginGbc.gridy++;
        loginPanel.add(usernameField, loginGbc);
        loginGbc.gridy++;
        loginPanel.add(passwordLabel, loginGbc);
        loginGbc.gridy++;
        loginPanel.add(passwordField, loginGbc);
        loginGbc.gridy++;
        loginPanel.add(loginButton, loginGbc);

        // Agregar panel de inicio de sesión a la ventana principal
        this.add(loginPanel);
    }

    /**
     * Verifica las credenciales de inicio de sesión.
     * @param username Nombre de usuario.
     * @param password Contraseña.
     * @return true si las credenciales son válidas, false de lo contrario.
     */
    private boolean verificarCredenciales(String username, String password) {
        // Verificar las credenciales con tu lógica de autenticación
        return username.equals("usuario") && password.equals("contraseña");
    }

    /**
     * Muestra el panel para crear una nueva cuenta bancaria.
     */
    private void mostrarCrearCuenta() {
        JPanel crearCuentaPanel = new JPanel();
        crearCuentaPanel.setOpaque(false);
        crearCuentaPanel.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = new Insets(10, 10, 10, 10);

        // Componentes para crear una nueva cuenta
        JLabel titularLabel = new JLabel("Titular:");
        titularLabel.setForeground(Color.BLACK);
        titularField = new JTextField(15);
        JLabel numeroCuentaLabel = new JLabel("Número de Cuenta:");
        numeroCuentaLabel.setForeground(Color.BLACK);
        numeroCuentaField = new JTextField(15);
        JLabel saldoLabel = new JLabel("Saldo:");
        saldoLabel.setForeground(Color.BLACK);
        saldoField = new JTextField(15);
        JLabel estadoLabel = new JLabel("Estado:");
        estadoLabel.setForeground(Color.BLACK);
        estadoField = new JTextField(15);
        estadoField.setEditable(false);
        crearCuentaButton = new JButton("Crear Cuenta");
        crearCuentaButton.setBackground(new Color(51, 153, 255));
        crearCuentaButton.setForeground(Color.WHITE);
        crearCuentaButton.setFocusPainted(false);

        // Acción para el botón de crear cuenta
        crearCuentaButton.addActionListener(e -> {
            String titular = titularField.getText();
            String numeroCuenta = numeroCuentaField.getText();
            double saldo = Double.parseDouble(saldoField.getText());
            boolean estado = saldo > 0;

            estadoField.setText(estado ? "Activo" : "Inactivo");

            JOptionPane.showMessageDialog(this, "Cuenta creada:\nTitular: " + titular + "\nNúmero de Cuenta: " + numeroCuenta + "\nSaldo: " + saldo + "\nEstado: " + (estado ? "Activo" : "Inactivo"), "Cuenta Creada", JOptionPane.INFORMATION_MESSAGE);
        });

        // Agregar componentes al panel de crear cuenta
        crearCuentaPanel.add(titularLabel, gbc);
        gbc.gridy++;
        crearCuentaPanel.add(titularField, gbc);
        gbc.gridy++;
        crearCuentaPanel.add(numeroCuentaLabel, gbc);
        gbc.gridy++;
        crearCuentaPanel.add(numeroCuentaField, gbc);
        gbc.gridy++;
        crearCuentaPanel.add(saldoLabel, gbc);
        gbc.gridy++;
        crearCuentaPanel.add(saldoField, gbc);
        gbc.gridy++;
        crearCuentaPanel.add(estadoLabel, gbc);
        gbc.gridy++;
        crearCuentaPanel.add(estadoField, gbc);
        gbc.gridy++;
        crearCuentaPanel.add(crearCuentaButton, gbc);

        // Actualizar la ventana principal con el panel de crear cuenta
        this.getContentPane().removeAll();
        this.getContentPane().add(crearCuentaPanel);
        this.revalidate();
        this.repaint();
    }

}





