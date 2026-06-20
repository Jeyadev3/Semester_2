package questions;
import java.util.Scanner;
public class weigthConverter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to Weight Converter");
		System.out.println("1. Convert kg to lbs");
		System.out.println("2. Convert lbs to kg");
		System.out.print("Enter a choice :");
		int choice = sc.nextInt();
		
		if (choice==1) {
			System.out.print("Enter the weight in kg :");
			double weight = sc.nextDouble();
			double newWeight = weight*2.20462;
			System.out.printf("The Weight in lbs is %.2f" , newWeight);
		}
		else if (choice==2) {
			System.out.print("Enter the weight in lbs :");
			double weight = sc.nextDouble();
			double newWeight = weight*0.453592;
			System.out.printf("The Weight in kgs is %.2f" , newWeight);
		}
		else {
			System.out.println("Please enter a valid choice");
		}
		sc.close();

	}

}
