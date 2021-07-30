package librarysystem.model;


public class Transaction{

	int tempUserId = -5; // some garbage
	int tempItemId = -5; // some garbage
	boolean child = false,other = false ;


	int validUser(int userId){
	
		for(int i=0;i<DAO.childrenUsers.length;i++){
			if(DAO.childrenUsers[i].id == userId){
				child = true ; 
				return i;
			}
		}

		for(int i=0;i<DAO.otherUsers.length;i++)
			if(DAO.otherUsers[i].id == userId){
				other = true ; return i;
			}
		return -1;
	}

	int validItem(int itemId){

		for(int i=0;i<DAO.hardMedias.length;i++)
			if(DAO.hardMedias[i].id == itemId)
				return i;

		return -1;
	}
	
	ChildrenUser getChildUser(int libraryCardNumber)
	{
		ChildrenUser childrenUser = null;
		for(int i=0;i<DAO.childrenUsers.length;i++){
			if(DAO.childrenUsers[i].library_card_number == libraryCardNumber){
				childrenUser = DAO.childrenUsers[i];
			}
		}
		
		return childrenUser;
	}
	
	int getNumberOfItemCheckedOutByUser(int libraryCardNumber)
	{
		int count = 0;
		for(int i=0;i<DAO.issuedBooks.length;i++){
			if(DAO.issuedBooks[i].library_card_number == libraryCardNumber){
				count++;
			}
		}
		
		return count;
	}
	
	boolean isItemAudioOrVideo(int itemId)
	{
		for(int i = 0 ; i<DAO.audioItems.length; i++)
		{
			if(DAO.audioItems[i].id == itemId)
			{
				return true;
			}
		}
		
		for(int i = 0 ; i<DAO.videoItems.length; i++)
		{
			if(DAO.videoItems[i].id == itemId)
			{
				return true;
			}
		}
		
		return false;
	}
	
	boolean isBestSeller(int itemId)
	{
		for(int i = 0 ; i<DAO.bestSellerItems.length; i++)
		{
			if(DAO.bestSellerItems[i].id == itemId)
			{
				return true;
			}
		}
		
		return false;
	}
	
	boolean isReferenceBooksOrMagazine(int itemId)
	{
		for(int i = 0 ; i<DAO.refernceBooks.length; i++)
		{
			if(DAO.refernceBooks[i].id == itemId)
			{
				return true;
			}
		}
		
		for(int i = 0 ; i<DAO.magazines.length; i++)
		{
			if(DAO.magazines[i].id == itemId)
			{
				return true;
			}
		}
		
		return false;
	}


	public String checkoutItem(int libraryCardNumber,int itemId){
		tempUserId = validUser(libraryCardNumber);
		if( tempUserId != -1)
		{
			tempItemId = validItem(itemId);
			if( tempItemId != -1){
				
				if(isReferenceBooksOrMagazine(itemId))
				{
					return "Any user cannot checkout reference books or magazines";
				}
				
				ChildrenUser childrenUser = getChildUser(libraryCardNumber);
				
				if(childrenUser)
				{
					if(getNumberOfItemCheckedOutByUser(libraryCardNumber) >= 5)
					{
						return "Children user can only checkout five items at a time";
					}
				}
				
				boolean isItemAudioOrVideo = isItemAudioOrVideo(itemId);
				
				if(isItemAudioOrVideo || isBestSeller(itemId))
				{
					//Write logic to checkout the item for only 2 weeks
				}
				else
				{
					//Write logic to checkout the item for 3 weeks
				}
			}
			else
				return ("\nOops ! Item not found. Please Enter valid Item ID.");
		}
		else
			return ("\nOops ! User not recognized. Please enter valid User ID.");

	}

	public String returnItem(int libraryCardNumber,int itemId){

		// Let's hope that user can return book so no need to check balance 

		if((tempUserId = validUser(libraryCardNumber)) != -1){
		
			if((tempItemId = validItem(itemId)) != -1){

				for(int i=0;i<DAO.issuedBooks.length;i++){
					if(DAO.issuedBooks[i].library_card_number == libraryCardNumber && DAO.issuedBooks[i].id == itemId){
						//Write code to remove it from the issued books
						//Increase quantity
					}
				}
				
				/*
				 * DAO.hardMedias[tempItemId].quantity++;
				 * DAO.hardMedias[tempItemId].availibility = true;
				 */

				return ("\nBook " + DAO.hardMedias[tempItemId].title + " Returned SuccessFully.");
			}
			else
				return ("\nOops ! Book not found. Please Enter valid Book ID.");
		}
		else
			return ("\nOops ! User not recognized. Please enter valid User ID.");

	}

	
}
