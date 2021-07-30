package librarysystem.Model;

public class Book extends Item {

	public String authorName;
	public int quantity;
	static int numberOfBooks = 0;
	Book() {
		super(null, 0, false);
		// TODO Auto-generated constructor stub
	}

	Book(String title, String authorName, int quantity){
		super(title, ++numberOfBooks, true);
		this.authorName = authorName;
		this.quantity = quantity;
	}
	
}
