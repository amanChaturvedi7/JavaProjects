package rationalnumbers;

public class Rational {
	private int num;
	private int deno;
	
	public void initializer(){
		num = 0;
		deno = 1;
	}
	
	public void initializer(int n){
		num = n;
		deno = 1;
	}
	
	public void initializer(int n, int d){
		num = n;
		deno = d;
	}
	
	public Rational additionRational(Rational r){
		Rational t = new Rational();
		t.num = r.num*t.deno + r.deno*t.num;
		t.deno = r.deno*t.deno;
		int g = gcd(t.num, t.deno);
		num = num/g;
		deno = deno/g;
		return t;
	}
	
	public int gcd(int x, int y){
		
		if(x%y == 0){
			return y;
		}
		else
			return gcd(y, x%y);
	}
	
	public void displayRational(){
		System.out.println(num + "/" + deno);
	}
}
