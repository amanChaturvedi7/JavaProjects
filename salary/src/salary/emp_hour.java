package salary;

public class emp_hour extends emp_sal{
	double sal_per_hr = 500;
	double overtime_sal = 700;
	
	emp_hour(int hrs){
		if(hrs<40)
			setSal(hrs*sal_per_hr);
		else
			setSal(40*sal_per_hr + (hrs - 40)*overtime_sal);
	}
}
