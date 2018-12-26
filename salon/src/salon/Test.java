package salon;

import java.util.Scanner;

public class Test {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		members a = new members();
		
		System.out.println("Choose membership type: \n1.Premium\n2.Gold\n3.Silver\n4.Not a member");
		int n = sc.nextInt();
		
		a.setMembership(n);
		String type = a.getMembershipType();
		System.out.println("Membership type: " + type);
		
		System.out.println("Enter the amount of services provided: ");
		double services = sc.nextInt();
		
		a.Discount();
		
		double x = a.pAmount(services);
		System.out.println("Service amount after discount: " + x);
		
		System.out.println("Enter the amount of products purchased: ");
		double m = sc.nextInt();
		
		double y;
		if(n != 4){
			y = m - 0.1*m;
		}
		else
			y = m;
		
		System.out.println("Product amount after discount: " + y);
		
		System.out.println("Total expenses of the customer: " + (x+y));
		
		sc.close();
	}
}
