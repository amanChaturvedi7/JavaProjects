
public class Student {
	private int roll_no;
	private double phy_t, chem_t, eng_t, phy_l, chem_l;
	private String name;
	
	public void setRollNo(int n){
		roll_no = n;
	}
	
	public int getRollNo(){
		return roll_no;
	}
	
	public void setName(String n){
		name = n;
	}
	
	public String getName(){
		return name;
	}
	
	public void setPhyT(double n){
		phy_t = n;
	}
	
	public double getPhyT(){
		return phy_t;
	}
	
	public void setChemT(double n){
		chem_t = n;
	}
	
	public double getChemT(){
		return chem_t;
	}
	
	public void setPhyL(double n){
		phy_l = n;
	}
	
	public double getPhyL(){
		return phy_l;
	}
	
	public void setChemL(double n){
		chem_t = n;
	}
	
	public double getChemL(){
		return chem_l;
	}
	
	public void setEngT(double n){
		eng_t = n;
	}
	
	public double getEngT(){
		return eng_t;
	}
	
}
