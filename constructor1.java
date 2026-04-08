package questions;
class constructor1{
	int roll;
	String name;
	int marks;
	
	constructor1(int roll,String name,int marks){
		this.roll = roll;
		this.name = name;
		this.marks = marks;
	}
	
	void addBonus(int m){
		 marks = marks+m;
	}
	
	void display() {
		System.out.println("Roll: " + roll + " Name: " + name + " Marks: " + marks);
	}
	
	public static void main(String[] args) {
		constructor1 s1 = new constructor1(1, "Ram",80);
		constructor1 s2 = new constructor1(2, "Ravi",75);
		
		s1.addBonus(5);
		s2.addBonus(5);
		
		s1.display();
		s2.display();
	}
}