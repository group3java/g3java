// GUI for Editing Password entry (Demo 1)
// Created by Daniel Rodriguez Zanuto

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EditEntry implements ActionListener {
	private static JLabel userLabel;
	private static JLabel passwordLabel;
	private static JLabel password2Label;
	private static JLabel password3Label;
	private static JFrame frame;
	private static JPanel panel;
	private static JTextField userText;
	private static JTextField passwordText;
	private static JTextField password2Text;
	private static JTextField password3Text;
	EditEntry() {
		frame = new JFrame();
		panel = new JPanel();
		frame.setSize(700, 500);
		frame.setTitle("Password Manager");
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(panel);
		panel.setLayout(null);
		
		userLabel = new JLabel("Enter Platform");
		userLabel.setBounds(200, 150, 100, 25);
		panel.add(userLabel);
		
		userText = new JTextField(20);
		userText.setBounds(300, 150, 200, 25);
		panel.add(userText); 
		
		passwordLabel = new JLabel("Confirm Old Password");
		passwordLabel.setBounds(160, 180, 200, 25);
		panel.add(passwordLabel);
		
		passwordText = new JTextField(20);
		passwordText.setBounds(300, 180, 200, 25);
		panel.add(passwordText);
		
		password2Label = new JLabel("Enter New Password");
		password2Label.setBounds(160, 210, 200, 25);
		panel.add(password2Label);
		
		password2Text = new JTextField(20);
		password2Text.setBounds(300, 210, 200, 25);
		panel.add(password2Text);
		
		password3Label = new JLabel("Confirm New Password");
		password3Label.setBounds(160, 240, 200, 25);
		panel.add(password3Label);
		
		password3Text = new JTextField(20);
		password3Text.setBounds(300, 240, 200, 25);
		panel.add(password3Text);
		
		JButton button = new JButton("Submit");
		button.setBounds(200, 280, 100, 25);
		button.addActionListener(this);
		panel.add(button);
		
		frame.setVisible(true);
	    }
	
	public void actionPerformed(ActionEvent e) {
		
		//will link to password storage
	}
}