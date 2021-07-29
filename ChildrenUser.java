package userclass;


public class ChildrenUser extends user {
	
	public int age;
	
	
	  ChildrenUser(String name,int age, String address, String phone_number, int library_card_number)
	  {
		super(name, address, phone_number, library_card_number);
		this.age=age;
		
	  }
	  
	    public int getAge()
		{
			return this.age;
		}
		
	    public void setAge(int age)
		{
			this.age= age;
		}
	  
}
