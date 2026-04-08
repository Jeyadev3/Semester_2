package Moni2;
import java.util.Scanner;

public class Book {

	private String title;
	private String author;
	private double price;
	
	Book(String title, String author,double price){
		this.title=title;
		this.author=author;
		this.price=price;
	}
	
	String getTitle() {
		return title;
	}
	
	String getAuthor() {
		return author;
	}
	
	double getPrice() {
		return price;
	}
	
	void setTitle(String title) {
		this.title=title;
	}
	
	void setAuthor(String author) {
		this.author=author;
	}
	
	void setPrice(double price) {
		this.price=price;
	}

	
	public static void main(String[] args) {
		
	
		Scanner sc=new Scanner(System.in);
		System.out.print("How many books? ");
		int n=sc.nextInt();
		
		sc.nextLine();
		
		Book[] arr=new Book[n];
		
		for(int i=0;i<n;i++) {
			System.out.println("ENTER TITLE");
			String t=sc.nextLine();
			System.out.println("ENTER AUTHOR");
			String a=sc.nextLine();
			System.out.println("ENTER PRICE");
			double p=sc.nextDouble();
			sc.nextLine();
			
			arr[i]=new Book(t,a,p);
			}
		
		int choice;
		
		do {
			System.out.println("----MENU----");
			System.out.println("1. SEARCH");
			System.out.println("2. PRICE");
			System.out.println("3. DISPLAY");
			System.out.println("4. EXIT");
			
			System.out.println("ENTER CHOICE :");
			choice=sc.nextInt();
			sc.nextLine();
			
			switch(choice) {
			case 1:
				System.out.println("Enter author name");
				String author1=sc.nextLine();
				for(int i=0;i<arr.length;i++) {
					if(arr[i].getAuthor().equalsIgnoreCase(author1)) {
						System.out.println(arr[i].getTitle());
					}
				}			
				break;
			case 2:
				System.out.println("Enter above price");
				double price=sc.nextDouble();
				for(int i=0;i<arr.length;i++) {
					if(arr[i].getPrice()>price) {
						System.out.println(arr[i].getTitle());
						
					}
				}
				break;
				
			case 3:
				System.out.println("Enter title");
				for(int i=0;i<arr.length;i++) {
					System.out.println(arr[i].title);
					
				}
				break;
				
			case 4:
				System.out.println("THANK U!");
				break;
				
			default:
				System.out.println("INVALID");
				break;
					
			}
		
	}while(choice!=4);
	}}
