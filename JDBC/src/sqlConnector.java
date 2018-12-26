
import java.util.*;
import java.sql.*;

class Main {
	public static void main(String args[]){
		Lnmiit lnm = new Lnmiit();
		try {
			lnm.fun();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}






















class Lnmiit {
	
	static final String db_url = "jdbc:mysql://localhost/lnmiit_track";
	static final String jdbc_driver = "com.mysql.jdbc.Driver";
	static final String username = "root";
	static final String password = "youngmoney$";
	
	void fun() {
		int a,i=0,j,rn;
		Scanner s = new Scanner(System.in);
		Connection conn = null;
		Statement stmt = null;
	
				try {
					Class.forName("com.mysql.jdbc.Driver");
				} catch (ClassNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
	
		
		try{
			System.out.println("Connecting to database...");
			conn = DriverManager.getConnection(db_url,username,password);
			System.out.println("Creating statement...");
			stmt = conn.createStatement();
			List<Student> std = new ArrayList<Student>();
			do{
				System.out.println("1.Insert Entry\n2.Search Entry\n3.Exit\n");
				a = s.nextInt();
				switch(a){
				case 1: std.add(new Student());
						System.out.println("Enter your name");
						std.get(i).setNam(s.next());
						System.out.println("Enter your Address");
						std.get(i).setAddr(s.next());
						System.out.println("Enter your contact");
						std.get(i).setContact(s.nextInt());
						System.out.println("Enter your Reason");
						std.get(i).setReason(s.next());
						i++;
						break;
				case 2: 
						System.out.println("Enter your contact");
						rn=s.nextInt();
						for(j=0;j<i;j++){
							if(rn==std.get(j).contact)
								break;
						}
						System.out.println(std.get(j)+"\t"+std.get(j).nam+ "\t"+ std.get(j).contact);
						break;
				case 3:
					for(int k=0; k<i; k++){
						String sql = "Insert into track values ('"+std.get(k).nam+"','"+std.get(k).addr+"',"+std.get(k).contact+",'"+std.get(k).reason+"')";
						stmt.executeUpdate(sql);
					}
				default: 
						System.out.println("Thanks!!!!!");
						break;
				}
			
			}while(a!=3);
			
		}
		catch(SQLException e){
			System.out.println(e);
			System.exit(1);
		}
	}
}



























class Student {
	String nam;
	String addr;
	int contact;
	String reason;
	public String getNam() {
		return nam;
	}
	public void setNam(String nam) {
		this.nam = nam;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public int getContact() {
		return contact;
	}
	public void setContact(int contact) {
		this.contact = contact;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
}
