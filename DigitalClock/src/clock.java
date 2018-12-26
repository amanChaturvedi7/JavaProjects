import java.util.Calendar;

public class clock extends Thread{
	Thread t = new Thread();
	
	public void run(){
		Calendar c = Calendar.getInstance();
		int h = c.get(Calendar.HOUR);
		int m = c.get(Calendar.MINUTE);
		int s = c.get(Calendar.SECOND);
		
		while(true){
			if(h==24)
				h = 0;
			
			if(m==59)
				{m = 0; h++;}
			
			if(s<59)
				s++;
			else
				{s = 0; m++;}
			
			System.out.printf("%d:%d:%d\n", h,m,s);
			try{Thread.sleep(1000);}catch(Exception e){};
		}
	}
}
