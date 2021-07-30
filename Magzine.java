package librarysystem.Model;

public class Magzine extends Item {

	public String magzineName;
	public int quantityMagzine;
	static int numberOfMagzine = 0;
	Magzine() {
		super(null, 0, false);
		// TODO Auto-generated constructor stub
	}

	Magzine(String title, String magzineName, int quantityMagzine){
		super(title, ++numberOfMagzine, true);
		this.magzineName = magzineName;
		this.quantityMagzine = quantityMagzine;
	}
}
