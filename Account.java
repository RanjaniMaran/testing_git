public abstract class Account {
	//defining data types for the abstract class
  private String id;
  private String password;
  private AccountStatus status;
  private Person person;
  public String itemid;
  public String itemName;
  public String itemCategory;
  public String Username;
  public String libraryCardNumber;
  public String issueDate;
  public String returnDate;
  public String dueDate;
  public String status;
  public int fine;
 
  
  public boolean resetPassword();


public void accountKeeping(String libraryCardNumber) { // it will store the status of the item using the library card number
	switch(status) { // update the status of item
	case issued: 
		FileWriter csvWriter = new FileWriter(libraryCardNumber+".csv" , true); //updating the status as issued by the library card holder 
		csvWriter.append(ItemId);
		csvWriter.append(",");
		csvWriter.append(ItemName);
		csvWriter.append(",");
		csvWriter.append(ItemCategory);
		csvWriter.append(",");
		csvWriter.append(Username);
		csvWriter.append(",");
		csvWriter.append(LibraryCardNumber);
		csvWriter.append(",");
		csvWriter.append(issueDate);
		csvWriter.append(",");
		csvWriter.append(returnDate);
		csvWriter.append(",");
		csvWriter.append(dueDate);
		csvWriter.append(",");
		csvWriter.append(status);
		csvWriter.append(",");
		csvWriter.append(fine);
		csvWriter.append("\n");

	case returned:
		FileWriter csvWriter = new FileWriter(libraryCardNumber+".csv"); //updating the status as returned by the library card holder 
		csvWriter.append(ItemId);
		csvWriter.append(",");
		csvWriter.append(ItemName);
		csvWriter.append(",");
		csvWriter.append(ItemCategory);
		csvWriter.append(",");
		csvWriter.append(Username);
		csvWriter.append(",");
		csvWriter.append(LibraryCardNumber);
		csvWriter.append(",");
		csvWriter.append(issueDate);
		csvWriter.append(",");
		csvWriter.append(returnDate);
		csvWriter.append(",");
		csvWriter.append(dueDate);
		csvWriter.append(",");
		csvWriter.append(status);
		csvWriter.append(",");
		csvWriter.append(fine);
		csvWriter.append("\n");
		
	case renewed:
		FileWriter csvWriter = new FileWriter(libraryCardNumber+".csv"); //updating the status as renewed by the library card holder
		csvWriter.append(ItemId);
		csvWriter.append(",");
		csvWriter.append(ItemName);
		csvWriter.append(",");
		csvWriter.append(ItemCategory);
		csvWriter.append(",");
		csvWriter.append(Username);
		csvWriter.append(",");
		csvWriter.append(LibraryCardNumber);
		csvWriter.append(",");
		csvWriter.append(issueDate);
		csvWriter.append(",");
		csvWriter.append(returnDate);
		csvWriter.append(",");
		csvWriter.append(dueDate);
		csvWriter.append(",");
		csvWriter.append(status);
		csvWriter.append(",");
		csvWriter.append(fine);
		csvWriter.append("\n");
		
	case viewed:
		FileWriter csvWriter = new FileWriter(libraryCardNumber+".csv"); //updating the status as viewed by the library card holder
		csvWriter.append(ItemId);
		csvWriter.append(",");
		csvWriter.append(ItemName);
		csvWriter.append(",");
		csvWriter.append(ItemCategory);
		csvWriter.append(",");
		csvWriter.append(Username);
		csvWriter.append(",");
		csvWriter.append(LibraryCardNumber);
		csvWriter.append(",");
		csvWriter.append(issueDate);
		csvWriter.append(",");
		csvWriter.append(returnDate);
		csvWriter.append(",");
		csvWriter.append(dueDate);
		csvWriter.append(",");
		csvWriter.append(status);
		csvWriter.append(",");
		csvWriter.append(fine);
		csvWriter.append("\n");
	}
}
}
