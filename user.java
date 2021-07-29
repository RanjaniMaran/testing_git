package userclass;


public class user {

	public String name;
	public String address;
	public String phone_number;
	public int library_card_number;
	
	user(String name, String address, String phone_number,int library_card_number)
	{
		this.name = name;
		this.address = address ; 
		this.phone_number = phone_number;
		this.library_card_number= library_card_number;
	}
	
	public String getName()
	{
		return this.name;
	}
	
	public void setName(String name)
	{
		this.name= name;
	}
	
	
	
	public String getAddress()
	{
		return this.address;
	}
	
	public void setAddress(String adress)
	{
		this.address= address;
	}
	public String getPhoneNumber()
	{
		return this.phone_number;
	}
	
	public void setPhoneNumber(String phone_number)
	{
		this.phone_number= phone_number;
	}
	
	public int getLibraryCardNumber()
	{
		return this.library_card_number;
	}
	
	public void setLibraryCardNUmber(int library_card_number )
	{
		this.library_card_number= library_card_number;
	}
	
//	void dataTest() // to test initalised data
//	{
//		System.out.println();
//		System.out.println("Catagory : User");
//		System.out.println("Name : " + name);
//		System.out.println("Address : " + address);
//		System.out.println("Age : " + age);
//		System.out.println("Phone : " + phone_number);
//		System.out.println("Lib Id : " + library_card_number);
//		System.out.println();
//	}
}
