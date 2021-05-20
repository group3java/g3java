// GUI for Password Manager Login Page (Demo1)
// Created by Victor Teas

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class LoginPage implements ActionListener {

	private static JLabel keyLabel;
	private static JTextField keyText;
	private static JButton button;
	private static JLabel submit;
	
	JFrame frame = new JFrame();
	
	LoginPage(){

		JPanel panel = new JPanel();
		
		frame.setSize(600, 400);
		frame.setTitle("Login Page");
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exits application when login page is closed
		frame.add(panel);
		
		panel.setLayout(null);
		
		keyLabel = new JLabel("Master Key");
		keyLabel.setBounds(150, 120, 80, 25);
		panel.add(keyLabel);
		
		keyText = new JTextField(20);
		keyText.setBounds(250, 120, 165, 25);
		panel.add(keyText);
		
		button = new JButton("Submit");
		button.setBounds(150, 160, 80, 25);
		button.addActionListener(this);
		panel.add(button);
		
		submit = new JLabel("");
		submit.setBounds(250, 160, 300, 25);
		panel.add(submit);
		
		frame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		String masterKey = keyText.getText(); // master key will be changed to encryption key in local storage file
		if(masterKey.equals("MK123")) { // login successful if set master key "MK123" is submitted
			submit.setText("Login Success");
			frame.dispose(); // close login page if master key is correct
			HomePage homePage = new HomePage(); // open home page if master key is correct
		}
		else {
			submit.setText("Invalid Master Key");
		}
	}
}