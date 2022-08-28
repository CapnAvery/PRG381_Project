package src.main.java.src.main.java.com.example.accessingdatamysql;

import javax.swing.JFrame;

import javax.swing.*;
import java.awt.*;

public class Student extends JFrame {
    final private Font mainFont = new Font("Arial", Font.PLAIN, 20);

    JTextField student_IDField = new JTextField("Student ID");
    JLabel student_IDLabel = new JLabel("Student ID", JLabel.CENTER);

    JTextField student_nameField = new JTextField("Student name");
    JLabel student_nameLabel = new JLabel("Student name", JLabel.CENTER);

    JTextField student_addressField = new JTextField("Student address");
    JLabel student_addressLabel = new JLabel("Student address", JLabel.CENTER);

    JTextField student_emailField = new JTextField("Student email");
    JLabel student_emailLabel = new JLabel("Student email", JLabel.CENTER);

    JTextField student_passwordField = new JTextField("Student email");
    JLabel student_passwordLabel = new JLabel("Student email", JLabel.CENTER);

    public Student() {

        // -------------Editable Items------------------
        student_IDField.setFont(mainFont);
        student_IDLabel.setFont(mainFont);
        student_nameField.setFont(mainFont);
        student_nameLabel.setFont(mainFont);
        student_addressField.setFont(mainFont);
        student_addressLabel.setFont(mainFont);
        student_emailField.setFont(mainFont);
        student_emailLabel.setFont(mainFont);
        student_passwordField.setFont(mainFont);
        student_passwordLabel.setFont(mainFont);

        JPanel IDPanel = new JPanel();
        IDPanel.setLayout(new FlowLayout());
        IDPanel.add(student_IDLabel);
        IDPanel.add(student_IDField);

        JPanel NamePanel = new JPanel();
        NamePanel.setLayout(new FlowLayout());
        NamePanel.add(student_nameLabel);
        NamePanel.add(student_nameField);

        JPanel addressPanel = new JPanel();
        addressPanel.setLayout(new FlowLayout());
        addressPanel.add(student_addressLabel);
        addressPanel.add(student_addressField);

        JPanel emailPanel = new JPanel();
        emailPanel.setLayout(new FlowLayout());
        emailPanel.add(student_emailLabel);
        emailPanel.add(student_emailField);

        JPanel passwordPanel = new JPanel();
        passwordPanel.setLayout(new FlowLayout());
        passwordPanel.add(student_passwordLabel);
        passwordPanel.add(student_passwordField);
        // -------------Combine all panels------------------
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
        mainPanel.add(IDPanel);
        mainPanel.add(NamePanel);
        mainPanel.add(addressPanel);
        mainPanel.add(emailPanel);
        mainPanel.add(passwordPanel);

        // -------------Frame------------------
        setTitle("Admin");
        setSize(600, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(BaseViewer.createBasePanel(mainPanel));
        setVisible(true);

    }

}
