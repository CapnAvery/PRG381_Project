package src.main.java.src.main.java.com.example.accessingdatamysql;

import javax.swing.JFrame;
import javax.swing.*;
import java.awt.*;

public class Admin extends JFrame {
    final private Font mainFont = new Font("Arial", Font.PLAIN, 20);
    JTextField Admin_IDField = new JTextField("Admin ID");
    JLabel Admin_IDLabel = new JLabel("Admin ID", JLabel.CENTER);

    JTextField Admin_nameField = new JTextField("Admin name");
    JLabel Admin_nameLabel = new JLabel("Admin name", JLabel.CENTER);

    JTextField Admin_PasswordField = new JTextField("Admin Password");
    JLabel Admin_PasswordLabel = new JLabel("Admin Password", JLabel.CENTER);

    JTextField Admin_ContactField = new JTextField("Admin Contact");
    JLabel Admin_ContactLabel = new JLabel("Admin Contact", JLabel.CENTER);

    public Admin() {

        // -------------Editable Items------------------
        Admin_IDField.setFont(mainFont);
        Admin_IDLabel.setFont(mainFont);
        Admin_nameField.setFont(mainFont);
        Admin_nameLabel.setFont(mainFont);
        Admin_PasswordField.setFont(mainFont);
        Admin_PasswordLabel.setFont(mainFont);
        Admin_ContactField.setFont(mainFont);
        Admin_ContactLabel.setFont(mainFont);

        JPanel IDPanel = new JPanel();
        IDPanel.setLayout(new FlowLayout());
        IDPanel.add(Admin_IDLabel);
        IDPanel.add(Admin_IDField);

        JPanel NamePanel = new JPanel();
        NamePanel.setLayout(new FlowLayout());
        NamePanel.add(Admin_nameLabel);
        NamePanel.add(Admin_nameField);

        JPanel PasswordPanel = new JPanel();
        PasswordPanel.setLayout(new FlowLayout());
        PasswordPanel.add(Admin_PasswordLabel);
        PasswordPanel.add(Admin_PasswordField);

        JPanel ContactPanel = new JPanel();
        ContactPanel.setLayout(new FlowLayout());
        ContactPanel.add(Admin_ContactLabel);
        ContactPanel.add(Admin_ContactField);

        // -------------Combine all panels------------------
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
        mainPanel.add(IDPanel);
        mainPanel.add(NamePanel);
        mainPanel.add(PasswordPanel);
        mainPanel.add(ContactPanel);

        // -------------Frame------------------
        setTitle("Admin");
        setSize(700, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(BaseViewer.createBasePanel(mainPanel));
        setVisible(true);

    }

}
