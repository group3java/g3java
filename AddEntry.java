//GUI for Adding Password entry (Demo 1)
// Created by Daniel Rodriguez Zanuto

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddEntry implements ActionListener {
    private static JLabel userLabel;
    private static JLabel passwordLabel;
    private static JFrame frame;
    private static JPanel panel;
    private static JTextField userText;
    private static JTextField passwordText;

    AddEntry() {
        frame = new JFrame();
        panel = new JPanel();
        frame.setSize(600, 400);
        frame.setTitle("Add Entry");
		frame.setLocationRelativeTo(null);
		frame.add(panel);
		panel.setLayout(null);
        
        userLabel = new JLabel("Enter Username");
        userLabel.setBounds(140, 120, 100, 25);
        panel.add(userLabel);
        
        userText = new JTextField(20);
        userText.setBounds(240, 120, 200, 25);
        panel.add(userText);
        
        passwordLabel = new JLabel("Enter Password");
        passwordLabel.setBounds(140, 170, 100, 25);
        panel.add(passwordLabel);
        
        passwordText = new JTextField(20);
        passwordText.setBounds(240, 170, 200, 25);
        panel.add(passwordText);
        
        JButton button = new JButton("Submit");
        button.setBounds(225, 220, 100, 25);
        button.addActionListener(this);
        panel.add(button);

        frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {

    	//will link to password storage
    }
}
