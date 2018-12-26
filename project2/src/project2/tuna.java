package project2;

public class tuna {
	private String name;
	private potpie birthdate;
	
	public tuna(String theName, potpie theDate){
		name = theName;
		birthdate = theDate;
	}
	
	public String toString(){
		return String.format("My name is %s and my birthdate is %s", name, birthdate);
	}
}
