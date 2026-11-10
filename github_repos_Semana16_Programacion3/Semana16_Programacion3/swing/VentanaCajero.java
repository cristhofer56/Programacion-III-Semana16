import javax.swing.*;
import java.awt.*;
public class VentanaCajero extends JFrame {
    public VentanaCajero() {
        super("Cajero Swing");
        setSize(350, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new VentanaCajero().setVisible(true));
    }
}