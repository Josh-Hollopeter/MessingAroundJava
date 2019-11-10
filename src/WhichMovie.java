import java.util.Scanner;
public class WhichMovie {
	public static void main(String[] args) {

	
	Scanner input = new Scanner(System.in);
	
	System.out.println("Please enter the first movie ");
	String movie1 = input.nextLine();
	System.out.println("Please enter the second movie ");
	String movie2 = input.nextLine();
	System.out.println("Please enter the third movie ");
	String movie3 = input.nextLine();
	
	double chance = 1 + Math.random() * 100;
	
	if(chance<=33) {
		System.out.println("You'll be going to see " + movie1);
	}
	else if(chance > 66) {
		System.out.println("You'll be going to see " + movie2);
		
	}
	else {
		System.out.println("You'll be going to see " + movie3);
	}
	input.close();
	}	
}
