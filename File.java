private void checkForFine(String bookItemBarcode) {

  BookLending bookLending = BookLending.fetchLendingDetails(bookItemBarcode);
  Date dueDate = bookLending.getDueDate();
  Date today = new Date();
    
	BufferReader csvReader = new BufferedReader(new FileReader(libraryCardNumber+".csv"));
	String row;
	while ((row = csvReader.readLine()) != null) {
	}
	    String[] data = row.split(",");{
	 
	if (data[8].equals("issued")) {
		
	if(returndate.equals("")) {
    // check if the book has been returned within the due date
    if (today.compareTo(dueDate) > 0) {
      long diff = todayDate.getTime() - dueDate.getTime();
      long diffDays = diff / (24 * 60 * 60 * 1000);
      Fine.collectFine(memberId, diffDays);
    }
	}
	else {
		 if (returndate.compareTo(dueDate) > 0) {
		   long diff = returndate.getTime() - dueDate.getTime();
		   long diffDays = diff / (24 * 60 * 60 * 1000);
		   Fine.collectFine(memberId, diffDays);
	}
	}
 }
}
 
