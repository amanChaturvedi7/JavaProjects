
public enum tuna {
	aman("coolintrovert", "19"),
	rach("cutiepie", "19");
	
	public final String desc;
	public final String age;
	
	tuna(String description, String year){
		desc = description;
		age = year;
	}
	
	public String getDesc(){
		return desc;
	}
	
	public String getAge(){
		return age;
	}
}
