package questions;
import java.util.Scanner;
class student_marks{
	int rollno;
	String name;
	double marks;
	student_marks(int rollno,String name,double marks){
		this.rollno = rollno;
		this.name = name;
		this.marks = marks;
	}
	void display() {
		System.out.println("roll number is " + rollno);
		System.out.println("Name is " + name);
		System.out.println("Marks is :" + marks);
	}	
}
public class Store_marks {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		student_marks arr[] = new student_marks[3];
		for(int i=0;i<3;i++) {
			System.out.print("Enter the roll no of student " + (i+1));
			int rnum = sc.nextInt();
			sc.nextLine();
			System.out.print("Enter the name of student " + (i+1));
			String sname = sc.nextLine();
			System.out.print("Enter the marks of student " + (i+1));
			double smarks = sc.nextDouble();
			arr[i] = new student_marks(rnum,sname,smarks);	
		}
		for(int i=0;i<3;i++) {
			arr[i].display();
		}
		sc.close();
	}
}
