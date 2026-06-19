package questions;
import java.util.Scanner;
public class Switch_operator {

	public static void main(String[] args) {
		double result = 0;
		boolean validOperation = true;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the first number :");
		double num1 = sc.nextDouble();
		System.out.print("Enter the second number :");
		double num2 = sc.nextDouble();
		System.out.print("Enter the operator(+,-,*,/) :");
		char operator = sc.next().charAt(0);
		switch(operator) {
			case '+' -> result = num1 + num2;
			case '-' -> result = num1 - num2;
			case '*' -> result = num1 * num2;
			case '/' -> {
				if(num2==0) {
					System.out.println("Cannot divide by zero");
					validOperation = false;
				}	
				else {
					result = num1 / num2;
				}	
			}
			default -> {
				System.out.print("Invalid Operator");
				validOperation = false;
			}
		}
		if(validOperation)
			System.out.print("The final result is :" + result);
		
		sc.close();
	}

}
