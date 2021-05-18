// WriteToFile class created by Ajay Chand

import java.io.FileWriter;   
import java.io.IOException;  

public class WriteToFile {
	// variable names edited by Victor to connect to AddEntry page
	String website = AddEntry.website;
	String email = AddEntry.email;
	String username = AddEntry.username;
	String password = AddEntry.password;
	
	{
	try {
		FileWriter pmInput = new FileWriter("Entries.txt", true); // true added by Victor to append to file
		pmInput.write("Website: " + website);
		pmInput.write(System.getProperty("line.separator"));
		pmInput.write("Email: " + email);
		pmInput.write(System.getProperty("line.separator"));
		pmInput.write("Username: " + username);
		pmInput.write(System.getProperty("line.separator"));
		pmInput.write("Password: " + password);
		pmInput.write(System.getProperty("line.separator"));
		pmInput.write(System.getProperty("line.separator"));
		
		pmInput.close();
		System.out.println("Done.");
		} catch (IOException e) {
			System.out.println("Error.");
			e.printStackTrace();
		}
	}
}