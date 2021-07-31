package librarysystem.model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Transaction{

	boolean isChildUser(String libraryCardNumber)
	{
		BufferedReader csvReader = null;
		try {
			csvReader = new BufferedReader(new FileReader("Userdetails.csv"));
			String row;
			while ((row = csvReader.readLine()) != null) {
			    String[] data = row.split(",");
			    int age = Integer.parseInt(data[5]);
			    String libraryCardNumberOfUser = data[6];
			    if (libraryCardNumber.equals(libraryCardNumberOfUser)) {
			    	csvReader.close();
			    	if(age <= 12)
			    	{
			    		return true;
			    	}
				}
			   
			}
			 
		}
		catch (IOException x) {
			System.err.println(x);
		}
		csvReader.close();
		return false;
	}
	
	boolean isItemAudio(String itemId)
	{
		if(itemId.startsWith("A"))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	boolean isItemVideo(String itemId)
	{
		if(itemId.startsWith("V"))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	boolean isBestSeller(String itemId)
	{
		if(itemId.startsWith("BS"))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	boolean isReferenceBooksOrMagazine(String itemId)
	{
		if(itemId.startsWith("R"))
		{
			return true;
		}
		else if(itemId.startsWith("M"))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public int getNumberOfItemCheckedOutByUser(String libraryCardNumber)
	{
		int count;
		BufferedReader csvReader = null;
		try {
			csvReader = new BufferedReader(new FileReader(libraryCardNumber+".csv"));
			String row;
			while ((row = csvReader.readLine()) != null) {
			    String[] data = row.split(",");
			    String status = data[7];
			    if (status.equals("issued")) {
			    	count++;
				}
			   
			}
			 
		}
		catch (IOException x) {
			System.err.println(x);
		}
		csvReader.close();
		return count;
		
	}


	public String checkoutItem(String libraryCardNumber,String itemId){
			
		if(isReferenceBooksOrMagazine(itemId))
		{
			return "Any user cannot checkout reference books or magazines";
		}
		
		if(isChildUser(libraryCardNumber))
		{
			if(getNumberOfItemCheckedOutByUser(libraryCardNumber) >= 5)
			{
				return "Children user can only checkout 5 items at a time";
			}
		}
		else
		{
			if(getNumberOfItemCheckedOutByUser(libraryCardNumber) >= 12)
			{
				return "User can only checkout 12 items at a time";
			}
		}
		
		if(isItemAudio(itemId) || isItemVideo(itemId) || isBestSeller(itemId))
		{
			//Write logic to checkout the item for only 2 weeks
		}
		else
		{
			//Write logic to checkout the item for 3 weeks
		}

	}
}
