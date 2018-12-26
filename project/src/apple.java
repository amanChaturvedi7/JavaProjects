import java.util.Scanner;

public class apple {
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		simplemessage textObject = new simplemessage();
		System.out.println("what's the name of ur first gf?");
		String temp = input.nextLine();
		textObject.setName(temp);
		textObject.saying();
	}
}
