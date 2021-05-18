// GUI for Adding Password entry (Demo 1)
// Created by Daniel Rodriguez Zanuto and modified by Victor Teas

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddEntry implements ActionListener {
    private static JLabel websiteLabel;
    private static JLabel emailLabel;
	private static JLabel userLabel;
    private static JLabel passwordLabel;
    private static JFrame frame;
    private static JPanel panel;
    private static JTextField websiteText;
    private static JTextField emailText;
    private static JTextField userText;
    private static JTextField passwordText;
    // Public variables added by Victor
    public static String website;
    public static String email;
    public static String username;
    public static String password;

    // Constructor done by Daniel
    AddEntry() {
        frame = new JFrame();
        panel = new JPanel();
        frame.setSize(600, 400);
        frame.setTitle("Add Entry");
		frame.setLocationRelativeTo(null);
		frame.add(panel);
		panel.setLayout(null);
        
		websiteLabel = new JLabel("Enter Website");
		websiteLabel.setBounds(140, 70, 140, 25);
        panel.add(websiteLabel);
        
        websiteText = new JTextField(20);
        websiteText.setBounds(240, 70, 200, 25);
        panel.add(websiteText);
		
        emailLabel = new JLabel("Enter Email");
        emailLabel.setBounds(140, 120, 100, 25);
        panel.add(emailLabel);
        
        emailText = new JTextField(20);
        emailText.setBounds(240, 120, 200, 25);
        panel.add(emailText);
        
        userLabel = new JLabel("Enter Username");
        userLabel.setBounds(140, 170, 100, 25);
        panel.add(userLabel);
        
        userText = new JTextField(20);
        userText.setBounds(240, 170, 200, 25);
        panel.add(userText);
        
        passwordLabel = new JLabel("Enter Password");
        passwordLabel.setBounds(140, 220, 100, 25);
        panel.add(passwordLabel);
        
        passwordText = new JTextField(20);
        passwordText.setBounds(240, 220, 200, 25);
        panel.add(passwordText);
        
        JButton button = new JButton("Submit");
        button.setBounds(225, 270, 100, 25);
        button.addActionListener(this);
        panel.add(button);

        frame.setVisible(true);
    }

    // Action listener done by Victor
    public void actionPerformed(ActionEvent e) {
    	AddEntry.website = websiteText.getText();
    	AddEntry.email = emailText.getText();
    	AddEntry.username = userText.getText();
    	AddEntry.password = passwordText.getText();
    	CreateFile createFile = new CreateFile();
    	WriteToFile writeToFile = new WriteToFile();
    }
}