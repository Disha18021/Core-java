import javax.swing.*;
import javax.swing.text.DefaultCaret;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ScrollPaneColorChangeApp extends JFrame {
    private JTextArea textArea;
    private JScrollPane scrollPane;

    public ScrollPaneColorChangeApp() {
        setTitle("ScrollPane Color Change App");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Initialize components
        textArea = new JTextArea();
        scrollPane = new JScrollPane(textArea);

        // Set word wrap for the text area
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);

        // Add components to the frame
        add(scrollPane, BorderLayout.CENTER);

        // Set caret to the end of text area by default
        DefaultCaret caret = (DefaultCaret)textArea.getCaret();
        caret.setUpdatePolicy(DefaultCaret.ALWAYS_UPDATE);

        // Create a button to change color
        JButton changeColorButton = new JButton("Change Color");
        changeColorButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                changeBackgroundColor();
            }
        });
        add(changeColorButton, BorderLayout.SOUTH);
    }

    private void changeBackgroundColor() {
        Color selectedColor = JColorChooser.showDialog(this, "Choose Background Color", textArea.getBackground());
        if (selectedColor != null) {
            textArea.setBackground(selectedColor);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ScrollPaneColorChangeApp().setVisible(true);
            }
        });
    }
}
