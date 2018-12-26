package multiThreading;

public class threadDemo {
	public static void main(String[] args)
	{
		Sin s = new Sin(3.14) ;
		Cos c = new Cos(3.14) ;
		Tan t = new Tan(3.14) ;
		
		s.start();try{Thread.sleep(1000);}catch(Exception e){}
		c.start();try{Thread.sleep(1000);}catch(Exception e){}
		t.start();try{Thread.sleep(1000);}catch(Exception e){}
		
		double p = c.a;
		System.out.println("P(x) : " + p);
	}
}

class Tan extends Thread {
	double x ;
	double a ;
	
	public Tan(double x)
	{
		this.x = x ;
	}
	
	public Tan()
	{
		x = 0 ;
	}
	
	public void run()
	{
		a = Math.tan(x) ;
		System.out.println("tan : " + a);
		try { Thread.sleep(500); } catch(Exception e){}
	}
}

class Cos extends Thread{
	double x ;
	double a ;
	
	public Cos(double x)
	{
		this.x = x ;
	}
	
	public Cos()
	{
		x = 0 ;
	}
	
	public void run()
	{
		a = Math.cos(x) ;
		System.out.println("cos : " + a);
		try { Thread.sleep(500); } catch(Exception e){}
	}
}

class Sin extends Thread{
	double x ;
	double a ;
	
	public Sin(double x)
	{
		this.x = x ;
	}
	
	public Sin()
	{
		x = 0 ;
	}
	
	public void run()
	{
		a = Math.sin(x) ;
		System.out.println("sin : " + a);
		try { Thread.sleep(500); } catch(Exception e){}
	}
	
}

