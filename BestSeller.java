package librarysystem.Model;

public class BestSeller extends Book{
	
	BestSeller(){
		super (null,null,0);
	}
	
	BestSeller(String title, String authorName, int quantity){
		super(title, authorName,quantity);
	}

}
