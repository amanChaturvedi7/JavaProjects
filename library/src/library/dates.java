package library;

public class dates extends book{
	int day;
	int month;
	int year;
	String issue_date;
	String return_date;
	
	public String toString(int d, int m, int y){
		day = d; month = m; year = y;
		return String.format("%d/%d/%d", day, month, year);
	}
	
	public void setIssueDate(int d, int m, int y){
		issue_date = toString(d, m, y);
	}
	
	public String getIssueDate(){
		return issue_date;
	}
	
	public void setReturnDate(int d, int m, int y){
		return_date = toString(d, m, y);
	}
	
	public String getReturnDate(){
		return return_date;
	}
}
