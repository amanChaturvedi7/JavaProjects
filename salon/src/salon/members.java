package salon;

public class members {
	private String membership;
	double sd ; 	//service discount
	double pd = 10;	//product discount
	
	public void setMembership(int n){
		
		if(n == 1)
			membership = "Premium";
		
		else if(n == 2)
			membership = "Gold";
		
		else if(n == 3)
			membership = "Silver";
		
		else if(n == 4){
			membership = "Not a member";
			pd = 0;
		}
		
		else
			System.out.println("Enter a valid option");
		
	}
	
	public String getMembershipType(){
		return membership;
	}	
	
	public void Discount(){
		if(membership == "Premium"){
			sd = 20;
		}
		
		else if(membership == "Gold"){
			sd = 15;
		}
		
		else if(membership == "Silver"){
			sd = 10;
		}
	}
	
	public double pAmount(double n){      //service amount to be paid after discount
			return (n - sd*n/100);
		}
}
