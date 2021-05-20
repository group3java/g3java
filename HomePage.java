// GUI for Password Manager Home Page (Demo1)
// Created by Victor Teas

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class HomePage implements ActionListener {
	
	private static JButton addButton;
	private static JButton editButton;
	private static JButton deleteButton;
	private static JLabel searchEntry;
	private static JTextField searchBar;
	private static JTable entries;
	
	HomePage() {
		
		JPanel panel = new JPanel();
		JFrame frame = new JFrame();
		frame.setSize(1200, 800);
		frame.setTitle("Password Manager");
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exits application when home page is closed
		frame.add(panel);
		
		panel.setLayout(null);
		
		addButton = new JButton("Add Entry");
		addButton.setBounds(1000, 150, 120, 25);
		addButton.addActionListener(this);
		panel.add(addButton);
		
		editButton = new JButton("Edit Entry");
		editButton.setBounds(1000, 250, 120, 25);
		editButton.addActionListener(this);
		panel.add(editButton);
		
		deleteButton = new JButton("Delete Entry");
		deleteButton.setBounds(1000, 350, 120, 25);
		// will have action listener after UI creation
		panel.add(deleteButton);
		
		searchEntry = new JLabel("Search");
		searchEntry.setBounds(750, 20, 350, 25);
		panel.add(searchEntry);
		
		searchBar = new JTextField(40);
		searchBar.setBounds(800, 20, 350, 25);
		// will have action listener when enter key is pressed
		panel.add(searchBar);
		
		String[] columns = {"", ""}; // two columns
		entries = new JTable();
		DefaultTableModel table = new DefaultTableModel();
		table = new DefaultTableModel();
		table.setColumnIdentifiers(columns);
		entries.setModel(table);
		entries.setBounds(50, 100, 900, 600);
		panel.add(entries);
		String line;
		BufferedReader reader;
		try {       
			File file = new File("Entries.txt");
			reader = new BufferedReader(new FileReader(file));
			while((line = reader.readLine()) != null) 
			{
				table.addRow(line.split(": ")); // splits labels and data into separate columns based on ": " from WriteToFile class
				}
			reader.close();
			}
		catch (IOException e) {
			e.printStackTrace();
			}
		
		frame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == addButton) {
			AddEntry addEntry = new AddEntry(); // opens instance of AddEntry class
		}
		else if (e.getSource() == editButton) {
			EditEntry editEntry = new EditEntry(); // opens instance of EditEntry class
		} // will add action listeners for deleteButton and searchBar
	}
}