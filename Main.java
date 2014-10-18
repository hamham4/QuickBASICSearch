package fastNFA;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import au.com.bytecode.opencsv.*;


public class Main {
	
	private static final int ORG_STATUS = 0;
	private static final int ORG_NAME = 2;
	private static final int PERSON_NAME = 4;
	private static final int NICKNAME = 6;
	

	public static void main(String[] args) {
		File file = new File("test.csv");
		CSVReader reader = null;
		Boolean isOrg = false;
		
		try {
			reader = new CSVReader(new FileReader(file));
			String[] nextLine;
			
			while ((nextLine = reader.readNext()) != null) {
				if (nextLine[ORG_STATUS] != null) {
					isOrg = true;
				}
				
				if (isOrg) {
					//create org object
				} else {
					//create person object
				}
				
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			//Display an error message to the user
			e.printStackTrace();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (reader != null) {
				try {
					reader.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		

	}

}
