package src.main.java.src.main.java.com.example.accessingdatamysql;

import javax.swing.*;
import java.awt.*;

public class BaseViewer {

    final private static Font mainFont = new Font("Arial", Font.PLAIN, 20);

    public static JPanel createBasePanel(JPanel CenterInfo) {

        // -------------Buttons------------------

        JButton editButton = new JButton("Confirm Edit");
        editButton.setFont(mainFont);
        editButton.addActionListener(arg0 -> {
            /* Add SQL code to see if the first and last names are inside the database */
        });
        JButton NextButton = new JButton("Next record");
        NextButton.setFont(mainFont);
        NextButton.addActionListener(arg0 -> {
            /* Add SQL code to see if the first and last names are inside the database */
        });
        JButton PreviousButton = new JButton("Previous record");
        PreviousButton.setFont(mainFont);
        PreviousButton.addActionListener(arg0 -> {
            /* Add SQL code to see if the first and last names are inside the database */
        });
        JButton DeleteButton = new JButton("Delete record");
        DeleteButton.setFont(mainFont);
        DeleteButton.addActionListener(arg0 -> {
            /* Add SQL code to see if the first and last names are inside the database */
        });
        JButton AddButton = new JButton("Add record");
        AddButton.setFont(mainFont);
        AddButton.addActionListener(arg0 -> {
            /* Add SQL code to see if the first and last names are inside the database */
        });
        JButton SearchButton = new JButton("Search record");
        SearchButton.setFont(mainFont);
        SearchButton.addActionListener(arg0 -> {
            /* Add SQL code to see if the first and last names are inside the database */
        });
        JButton MainMenuButton = new JButton("Main Menu");
        MainMenuButton.setFont(mainFont);
        MainMenuButton.addActionListener(arg0 -> {
            /* Add SQL code to see if the first and last names are inside the database */
        });
        // -------------Center Layout------------------
        JPanel CenterPanel = new JPanel();
        CenterPanel.setLayout(new FlowLayout());
        CenterPanel.add(PreviousButton);
        CenterPanel.add(CenterInfo);
        CenterPanel.add(NextButton);
        // -------------Center Buttons------------------
        JPanel CenterButtonsPanel = new JPanel();
        CenterButtonsPanel.setLayout(new FlowLayout());
        CenterButtonsPanel.add(editButton);
        CenterButtonsPanel.add(DeleteButton);
        CenterButtonsPanel.add(AddButton);
        // -------------Top Buttons------------------
        JPanel TopButtonsPanel = new JPanel();
        TopButtonsPanel.setLayout(new FlowLayout());
        TopButtonsPanel.add(SearchButton);
        TopButtonsPanel.add(MainMenuButton);

        // -------------Main Piece------------------
        JPanel MainPanel = new JPanel();
        MainPanel.setLayout(new FlowLayout());
        MainPanel.add(TopButtonsPanel);

        MainPanel.add(CenterPanel);

        MainPanel.add(CenterButtonsPanel);
        // -------------Frame------------------
        return MainPanel;

    }

}
