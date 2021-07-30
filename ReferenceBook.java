package librarysystem.Model;

public class ReferenceBook extends Item {
	public String rauthorName;
	public int rquantity;
	static int numberOfRBooks = 0;
	ReferenceBook() {
		super(null, 0, false);
		// TODO Auto-generated constructor stub
	}

	ReferenceBook(String title, String rauthorName, int rquantity){
		super(title, ++numberOfRBooks, true);
		this.rauthorName = rauthorName;
		this.rquantity = rquantity;
	}
	
}
