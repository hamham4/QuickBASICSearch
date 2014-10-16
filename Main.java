package fastNFA;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		BufferedReader reader = null;
		File file = new File("test.csv");
		
		try {
			String text = "";
			reader = new BufferedReader(new FileReader(file));
			while ((text = reader.readLine()) != null) {
				System.out.println(text);
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
