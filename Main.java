package fastNFA;

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
			
			//Skip header
			nextLine = reader.readNext();
			while ((nextLine = reader.readNext()) != null) {

				if (nextLine[ORG_STATUS] != null && nextLine[ORG_STATUS].trim().length() > 0) {
					isOrg = true;
				}
				
				if (isOrg) {
					Org org = new Org(nextLine[ORG_NAME]);
					System.out.println(org.getName());
				} else {
					Person person = createPerson(nextLine[PERSON_NAME], nextLine[NICKNAME]);
					System.out.println(person.getLname() + " " + person.getFname());
					
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
	
	private static Person createPerson(String name, String nickName) {
		String[] names = name.split(",");
		String lastName = names[0];
		String firstName = names[1];
		
		Person person = new Person(lastName, firstName);
		if (nickName != null) {
			person.setNickName(nickName);
		}
		
		return person;
		
	}
	
	

}
