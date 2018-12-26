
public class tuna {
	private String first;
	private String last;
	private static int members;
	
	public tuna(String firstName, String lastName){
		first = firstName;
		last = lastName;
		members++;
		
		System.out.printf("constructor for %s %s, Number of members in the club:%d\n", first, last, members );
	}
	
	public String getFirst(){
		return first;
	}
	
	public String getLast(){
		return last;
	}
	
	public static int getMembers(){
		return members;
	}
}
