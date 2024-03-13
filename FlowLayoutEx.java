import javax.swing.*;
import java.awt.*;

public class FlowLayoutEx {
    public static void main(String[] args) {
        // Create a JFrame
        JFrame frame = new JFrame("Flow Layout Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Create a panel with FlowLayout
        JPanel panel = new JPanel(new FlowLayout());
        
        // Add components to the panel
        panel.add(new JButton("Button 1"));
        panel.add(new JButton("Button 2"));
        panel.add(new JButton("Button 3"));
        panel.add(new JButton("Button 4"));
        panel.add(new JButton("Button 5"));
        
        // Add the panel to the frame
        frame.add(panel);
        
        // Set frame size and visibility
        frame.setSize(300, 200);
        frame.setVisible(true);
    }
}
