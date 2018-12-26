package project2;

public class potpie {
	private int day;
	private int month;
	private int year;
	
	public potpie(int d, int m, int y){
		day=d;
		month=m;
		year=y;
		
		System.out.printf("The date of this constructor is %s\n" , this);
	}
	
	public String toString(){
		return String.format("%d/%d/%d", day, month, year);
	}
		
	
}
