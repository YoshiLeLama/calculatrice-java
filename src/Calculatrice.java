import javax.swing.*;
import java.awt.*;
import java.nio.file.DirectoryNotEmptyException;

public class Calculatrice extends JFrame {
    private static final String[] buttonTexts = {"7", "8", "9", "/", "4", "5", "6", "x", "1", "2", "3", "-", "0", ".", "=", "+"};

    JPanel mainPanel;
    JTextField displayField;
    JPanel commandButtons;

    public Calculatrice() {
        mainPanel = new JPanel();
        getContentPane().add(mainPanel);
        BorderLayout windowLayout = new BorderLayout(10, 10);
        mainPanel.setLayout(windowLayout);

        displayField = new JTextField("0");
        displayField.setEditable(false);
        displayField.setFont(new Font("Comic Sans MS", Font.PLAIN, 32));
        mainPanel.add(displayField, BorderLayout.NORTH);

        commandButtons = new JPanel(new GridLayout(4, 4, 5, 5));
        mainPanel.add(commandButtons, BorderLayout.CENTER);

        for (int i = 0; i < 4; ++i) {
            for (int j = 0; j < 4; ++j) {
                JButton button = new JButton(buttonTexts[i * 4 + j]);
                button.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
                commandButtons.add(button, BorderLayout.CENTER);
            }
        }

        setMinimumSize(new Dimension(400, 400));
        pack();
        setVisible(true);
    }

    public static void main(String[] args) {
        Calculatrice calculatrice = new Calculatrice();
    }
}
