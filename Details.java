package librarysystem.Model;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.UUID;


public class Details {
	
	Details(){
		
	}

	public boolean login(String username, String password) throws IOException {
		String user;
		String pass;
		BufferedReader csvReader = null;
		try {
			csvReader = new BufferedReader(new FileReader("Userdetails.csv"));
			String row;
			while ((row = csvReader.readLine()) != null) {
			    String[] data = row.split(",");
			    user = data[0];
			    pass= data[1];
			    if (user.equals(username) && pass.equals(password)) {
			    	csvReader.close();
					return true;
				}
			   
			}
			 
		}
		
		
		catch (IOException x) {
			System.err.println(x);
		}
		csvReader.close();
		return false;

	}

	
	public String register(String username, String password,String name,  String address, String phone, String age  ) throws IOException {
		String libraryCardNumber = null;
		try (FileWriter csvWriter = new FileWriter("Userdetails.csv")) {
			csvWriter.append(username);
			csvWriter.append(",");
			csvWriter.append(password);
			csvWriter.append(",");
			csvWriter.append(name);
			csvWriter.append(",");
			csvWriter.append(address);
			csvWriter.append(",");
			csvWriter.append(phone);
			csvWriter.append(",");
			csvWriter.append(age);
			csvWriter.append("\n");
			libraryCardNumber = UUID.randomUUID().toString();
		}
		catch (IOException x) {
			System.err.println(x);
		}
		return libraryCardNumber;
	}
}	
	

