
public class potpie {
	private int day;
	private int month;
	private int year;
	
	public potpie(int d, int m, int y){
		day=d;
		month=m;
		year=y;
		
		System.out.printf("the constructor for this is %s", this);
	}
	
	public String toString(){
		return String.format("%d/%d/%d", day, month, year);
	}
}
