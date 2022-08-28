package src.main.java.src.main.java.com.example.accessingdatamysql;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {
    final private Font mainFont = new Font("Arial", Font.PLAIN, 20);
    JTextField tfFirstName, tfLastName;
    JLabel welcomeLabel;

    public void init() {
        JLabel label = new JLabel("Hello World");
        label.setFont(mainFont);

        tfFirstName = new JTextField(40);
        tfFirstName.setFont(mainFont);

        tfLastName = new JTextField(40);
        tfLastName.setFont(mainFont);

        welcomeLabel = new JLabel("Welcome");
        welcomeLabel.setFont(mainFont);

        JPanel panel = new JPanel();
        panel.add(label);
        panel.add(tfFirstName);
        panel.add(tfLastName);

        JButton button = new JButton("Click Me");
        button.setFont(mainFont);
        button.addActionListener(arg0 -> {
            welcomeLabel.setText("Welcome " + tfFirstName.getText() + " " + tfLastName.getText());
        });

        JButton ClearAllButton = new JButton("Clear All");
        ClearAllButton.setFont(mainFont);
        ClearAllButton.addActionListener(arg0 -> {
            tfFirstName.setText("");
            tfLastName.setText("");
            welcomeLabel.setText("Welcome");
        });
        JPanel ButtonsPanel = new JPanel();
        ButtonsPanel.add(button);
        ButtonsPanel.add(ClearAllButton);
        ButtonsPanel.setLayout(new GridLayout(1, 2));

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());
        mainPanel.setBackground(new Color(128, 128, 255));
        mainPanel.add(panel, BorderLayout.CENTER);
        mainPanel.add(welcomeLabel, BorderLayout.NORTH);
        mainPanel.add(ButtonsPanel, BorderLayout.SOUTH);

        add(mainPanel);
        setTitle("MainFrame");
        setSize(500, 500);
        setMinimumSize(new Dimension(300, 300));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        MainFrame frame = new MainFrame();
        frame.init();
    }
}