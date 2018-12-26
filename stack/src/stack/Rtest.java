package stack;

public class Rtest {
	public static void main(String[] args){
		stck a = new stck();
		stck a1 = new stck(10);
		a.push(5);
		a.push(15);
		a.push(25);
		int v = a.pop();
		int x = a.pop();
		System.out.println(v);
		System.out.println(x);
	}
}
