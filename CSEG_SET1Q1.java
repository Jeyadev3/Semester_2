package lab_eval2;
import java.util.Scanner;

class Voter{
	int vid;
	String name;
	int age;
	String constituency;
	
	Voter(int vid,String name,int age,String constituency){
		this.vid=vid;
		this.name=name;
		this.age=age;
		this.constituency=constituency;
	}
	void displayVoterDetails(){
		System.out.println("---Voter Details---");
		System.out.println("Voter ID :" + vid);
		System.out.println("Voter Name :" + name);
		System.out.println("Age :" + age);
		System.out.println("Constituency :" + constituency);
	}
	void isEligibleToVote(){
		if(age>17) {
			System.out.println("Voter is ELigible to vote");
		}
		else {
			System.out.println("Voter is not eligible to vote");
		}
	}
	void castVote() {
		if(vid<5000) {
			System.out.println("Online authentication successful");
			System.out.println("Vote cast successfully through Online Voting.");
		}
		else {
			System.out.println("Online authentication not successful");
		}
	}
}

public class CSEG_SET1Q1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice;
		do {
			System.out.print("Enter Voter ID :");
			int vid = sc.nextInt();
			sc.nextLine();
			
			System.out.print("Enter Voter Name :");
			String name = sc.nextLine();
			
			System.out.print("Enter Age :");
			int age = sc.nextInt();
			sc.nextLine();
			
			System.out.print("Enter Constituency :");
			String cons = sc.nextLine();
			
			 Voter v =
			            new Voter(
			            vid,
			            name,
			            age,
			            cons);

			            System.out.println();

			            v.displayVoterDetails();

			            v.isEligibleToVote();

			            v.castVote();

			            System.out.println();

			            System.out.println(
			            "1. Continue");

			            System.out.println(
			            "2. Exit");

			            System.out.print(
			            "Enter Choice : ");

			            choice =
			            sc.nextInt();
						
		}while(choice == 1);
		
		System.out.println("Program ended");

	}

}
