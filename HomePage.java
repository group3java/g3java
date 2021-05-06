//GUI for Password Manager Home Page (Demo1)
//Created by Victor Teas

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class HomePage implements ActionListener {
	
	private static JButton addButton;
	private static JButton editButton;
	private static JButton deleteButton;
	private static JLabel searchEntry;
	private static JTextField searchBar;
	
	HomePage() {
		
		JPanel panel = new JPanel();
		JFrame frame = new JFrame();
		frame.setSize(800, 600);
		frame.setTitle("Password Manager");
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(panel);
		
		panel.setLayout(null);
		
		addButton = new JButton("Add Entry");
		addButton.setBounds(600, 150, 120, 25);
		addButton.addActionListener(this);
		panel.add(addButton);
		
		editButton = new JButton("Edit Entry");
		editButton.setBounds(600, 250, 120, 25);
		panel.add(editButton);
		
		deleteButton = new JButton("Delete Entry");
		deleteButton.setBounds(600, 350, 120, 25);
		panel.add(deleteButton);
		
		searchEntry = new JLabel("Search");
		searchEntry.setBounds(350, 20, 350, 25);
		panel.add(searchEntry);
		
		searchBar = new JTextField(40);
		searchBar.setBounds(400, 20, 350, 25);
		panel.add(searchBar);
		
		frame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		AddEntry addEntry = new AddEntry();
	}
}
