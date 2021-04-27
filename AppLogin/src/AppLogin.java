//GUI for Password Manager Login Page (Demo1)
//Created by Victor Teas

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class AppLogin implements ActionListener {

	private static JLabel keyLabel;
	private static JTextField keyText;
	private static JButton button;
	private static JLabel submit;
	
	public static void main(String[] args) {

		JPanel panel = new JPanel();
		JFrame frame = new JFrame();
		frame.setSize(600, 400);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
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
		button.addActionListener(new AppLogin());
		panel.add(button);
		
		submit = new JLabel("");
		submit.setBounds(250, 160, 300, 25);
		panel.add(submit);
		
		frame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String masterKey = keyText.getText();
		
		//will be changed to equal randomly generated master key
		if(masterKey.equals("MasterKey123")) {
			submit.setText("Login Success"); //will direct user to application home page
		}
		else {
			submit.setText("Invalid Master Key");
		}
	}

}