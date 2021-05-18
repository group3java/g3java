// CreateFile class created by Ajay Chand

import java.io.File;
import java.io.IOException;

public class CreateFile {
	{
	try {
		String  MultiTool = "Entries.txt";
		File myObj = new File(MultiTool);
		
		if (myObj.createNewFile()) {
			System.out.println("File created: " + myObj.getName());
			} else {
				System.out.println("File already exists.");
				}
		} catch (IOException e) {
			System.out.println("Error.");
			e.printStackTrace();
			}
	}
}