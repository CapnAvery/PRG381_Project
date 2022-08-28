package src.main.java.src.main.java.com.example.accessingdatamysql;

import javax.swing.JFrame;
import javax.swing.*;
import java.awt.*;

public class Register extends JFrame {
    final private Font mainFont = new Font("Arial", Font.PLAIN, 20);
    JTextField Register_IDField = new JTextField("Register ID");
    JLabel Register_IDLabel = new JLabel("Register ID", JLabel.CENTER);

    JTextField Register_nameField = new JTextField("Register name");
    JLabel Register_nameLabel = new JLabel("Register name", JLabel.CENTER);

    JTextField Register_addressField = new JTextField("Register address");
    JLabel Register_addressLabel = new JLabel("Register address", JLabel.CENTER);

    JTextField Register_emailField = new JTextField("Register email");
    JLabel Register_emailLabel = new JLabel("Register email", JLabel.CENTER);

    JTextField Register_passwordField = new JTextField("Register email");
    JLabel Register_passwordLabel = new JLabel("Register email", JLabel.CENTER);

    JTextField Course_NameField = new JTextField("Course Name");
    JLabel Course_NameLabel = new JLabel("Course Name", JLabel.CENTER);

    public Register() {
        // -------------Editable Items------------------
        Register_IDField.setFont(mainFont);
        Register_IDLabel.setFont(mainFont);
        Register_nameField.setFont(mainFont);
        Register_nameLabel.setFont(mainFont);
        Register_addressField.setFont(mainFont);
        Register_addressLabel.setFont(mainFont);
        Register_emailField.setFont(mainFont);
        Register_emailLabel.setFont(mainFont);
        Register_passwordField.setFont(mainFont);
        Register_passwordLabel.setFont(mainFont);
        Course_NameField.setFont(mainFont);
        Course_NameLabel.setFont(mainFont);

        JPanel IDPanel = new JPanel();
        IDPanel.setLayout(new FlowLayout());
        IDPanel.add(Register_IDLabel);
        IDPanel.add(Register_IDField);

        JPanel NamePanel = new JPanel();
        NamePanel.setLayout(new FlowLayout());
        NamePanel.add(Register_nameLabel);
        NamePanel.add(Register_nameField);

        JPanel addressPanel = new JPanel();
        addressPanel.setLayout(new FlowLayout());
        addressPanel.add(Register_addressLabel);
        addressPanel.add(Register_addressField);

        JPanel emailPanel = new JPanel();
        emailPanel.setLayout(new FlowLayout());
        emailPanel.add(Register_emailLabel);
        emailPanel.add(Register_emailField);

        JPanel passwordPanel = new JPanel();
        passwordPanel.setLayout(new FlowLayout());
        passwordPanel.add(Register_passwordLabel);
        passwordPanel.add(Register_passwordField);

        JPanel Course_NamePanel = new JPanel();
        Course_NamePanel.setLayout(new FlowLayout());
        Course_NamePanel.add(Course_NameLabel);
        Course_NamePanel.add(Course_NameField);
        // -------------Combine all panels------------------
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
        mainPanel.add(IDPanel);
        mainPanel.add(NamePanel);
        mainPanel.add(addressPanel);
        mainPanel.add(emailPanel);
        mainPanel.add(passwordPanel);
        mainPanel.add(Course_NamePanel);

        // -------------Frame------------------
        setTitle("Register");
        setSize(700, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(BaseViewer.createBasePanel(mainPanel));
        setVisible(true);

    }

}
