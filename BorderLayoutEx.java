import javax.swing.*;
import java.awt.*;

public class BorderLayoutEx {
    public static void main(String[] args) {
        // Create a JFrame
        JFrame frame = new JFrame("Border Layout Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a panel with BorderLayout
        JPanel panel = new JPanel(new BorderLayout());

        // Add buttons to different positions of the panel
        panel.add(new JButton("North"), BorderLayout.NORTH);
        panel.add(new JButton("South"), BorderLayout.SOUTH);
        panel.add(new JButton("East"), BorderLayout.EAST);
        panel.add(new JButton("West"), BorderLayout.WEST);
        panel.add(new JButton("Center"), BorderLayout.CENTER);

        // Add the panel to the frame
        frame.add(panel);

        // Set frame size and visibility
        frame.setSize(300, 200);
        frame.setVisible(true);
    }
}
