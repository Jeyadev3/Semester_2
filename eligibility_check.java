package Project;
import java.util.Scanner;
public class eligibility {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("What is your name :");
		String name = scanner.nextLine();
		
		if (name.isEmpty()) {
			System.out.println("You didn't enter your name");
		}
		else {
			System.out.println("Hello " + name + "!");
		}
		
		System.out.print("What is your age :");
		int age = scanner.nextInt();
		
		
		if (age>=18) {
			System.out.println("You are an adult");
		}
		
		else if(age<7){
			System.out.print("You are a baby");
			
			
		}
		else {
			System.out.print("You are not an adult");
		}
		
	scanner.close();
	}
}
