package questions;
import java.util.Random;
import java.util.Scanner;
public class Guess_Num {

	public static void main(String[] args) {
		int guess;
		int attempt = 0;
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		int randomNum = random.nextInt(1,11);
		System.out.print("Welcome to the Number guessing game");
		do {
			System.out.print("Enter your guess(1-10) :");
			guess = sc.nextInt();
			attempt++;
			
			if (randomNum > guess) {
				System.out.println("TOO LOW! Try again");
			}
			else if(randomNum < guess) {
				System.out.println("TOO HIGH! Try again");
			}
			else {
				System.out.println("The number was " + randomNum);
				System.out.print("The total attempts taken was " + attempt);
			}
		} while(guess != randomNum);
	sc.close();	
	}

}
