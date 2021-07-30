package librarysystem.Model;

public class Item {
	
	public String nameOfitem;
	public int id;
	boolean availability;
	
	Item(String name, int id, boolean avaliability){
	
		this.nameOfitem = name;
		this.id = id;
		this.availability = avaliability;
	}
	

}
