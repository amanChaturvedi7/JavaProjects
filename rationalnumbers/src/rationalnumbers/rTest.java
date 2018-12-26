package rationalnumbers;

public class rTest {
	public static void main(String[] args){
		Rational r1, r2, r3;
		r1 = new Rational();
		r2 = new Rational();
		r3 = new Rational();
		
		r1.initializer(3, 5);
		r2.initializer(5, 7);
		
		r3 = r1.additionRational(r2);
		
		r1.displayRational();
		r2.displayRational();
		r3.displayRational();
	}
}
