public abstract class Account {
  private String id;
  private String password;
  private AccountStatus status;
  private Person person;
  public String itemid;
  public String itemName;
  public String itemCategory;
  public String Username;
  public String libraryCardNumber;
  public Date issueDate;
  public Date returnDate;
  public String status;
  public int fine;
  
  public boolean resetPassword();


public void accountKeeping(String libraryCardNumber) {
	switch(status) {
	case issued: 
		FileWriter csvWriter = new FileWriter(libraryCardNumber+".csv");
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
		csvWriter.append(status);
		csvWriter.append(",");
		csvWriter.append(fine);
		csvWriter.append("\n");

	case returned:
		FileWriter csvWriter = new FileWriter(libraryCardNumber+".csv");
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
		csvWriter.append(status);
		csvWriter.append(",");
		csvWriter.append(fine);
		csvWriter.append("\n");
		
	case renewed:
		FileWriter csvWriter = new FileWriter(libraryCardNumber+".csv");
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
		csvWriter.append(status);
		csvWriter.append(",");
		csvWriter.append(fine);
		csvWriter.append("\n");
		
	case viewed:
		FileWriter csvWriter = new FileWriter(libraryCardNumber+".csv");
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
		csvWriter.append(status);
		csvWriter.append(",");
		csvWriter.append(fine);
		csvWriter.append("\n");
	}
}
}
