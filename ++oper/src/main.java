
public class main {
	public static void main(String[] args){
		
		int a = 2, b;
		
		b = (a++)*(++a) - (++a);
		
		System.out.println("a = " +a + " b =" + b);
	}
}
