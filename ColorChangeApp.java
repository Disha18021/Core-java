import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class ColorChangeApp extends JFrame {
    private JButton changeColorButton;
    private JPanel colorPanel;
    private Random random;

    public ColorChangeApp() {
        setTitle("Color Change App");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Initialize components
        random = new Random();
        changeColorButton = new JButton("Change Color");
        colorPanel = new JPanel();
        colorPanel.setBackground(Color.WHITE);

        // Add components to the frame
        setLayout(new BorderLayout());
        add(changeColorButton, BorderLayout.NORTH);
        add(colorPanel, BorderLayout.CENTER);

        // Add action listener to the button
        changeColorButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                changeColor();
            }
        });
    }

    private void changeColor() {
        // Generate random RGB values
        int red = random.nextInt(256);
        int green = random.nextInt(256);
        int blue = random.nextInt(256);

        // Create a new color
        Color randomColor = new Color(red, green, blue);

        // Set background color of the panel
        colorPanel.setBackground(randomColor);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ColorChangeApp().setVisible(true);
            }
        });
    }
}
