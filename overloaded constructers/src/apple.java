
public class apple {
	public static void main(String args[]){
		tuna tunaObject = new tuna();
		tuna tunaObject2 = new tuna(5);
		tuna tunaObject3 = new tuna(5,15);
		tuna tunaObject4 = new tuna(5,15,30);
		
		System.out.printf("%s\n", tunaObject.toMilitary());
		System.out.printf("%s\n", tunaObject2.toMilitary());
		System.out.printf("%s\n", tunaObject3.toMilitary());
		System.out.printf("%s\n", tunaObject4.toMilitary());
		
		potpie potpieObject = new potpie(1,2,3);
	}
}
