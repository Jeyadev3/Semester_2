package Moni2;
import java.util.Scanner();


public class Movie {
			private String title;
			private String director;
			private double rating;
			
			Movie(String title,String director,double rating){
				this.title=title;
				this.director=director;
				this.rating=rating;}
				
			String getTitle() {
				return title;}
			
			String getDirector() {
				return director;
			}
			
			double getRating() {
				return rating;	}
			
			void setTitle(String title) {
				this.title=title;
			}
			
			void setDirector(String director) {
				this.director=director;
			}
			
			void setRating(double rating) {
				this.rating=rating;
			}
			
			static void displayDetails(Movie[] arr) {
				for(int i=0;i<arr.length;i++) {
					System.out.println(arr[i].getTitle()+" "+arr[i].getDirector()+" "+arr[i].getRating());
				}
				
			}
			
			static void rating(Movie[] arr, double rating1) {
				for(int i=0;i<arr.length;i++) {
					if(arr[i].getRating()>rating1) {
						System.out.println(arr[i].getTitle());
					}
				}
			}
			
			static void search(Movie[] arr, String director1) {
				for(int i=0;i<arr.length;i++) {
					if(arr[i].director.equalsIgnoreCase(director1)) {
						System.out.println(arr[i].getTitle());
					}
				}
			}
			
			public static void main(String[] args) {
				Scanner sc=new Scanner(System.in);
				int n=sc.nextInt();
				Movie[] arr=new Movie[n];
				
				for(int i=0;i<n;i++) {
				System.out.println("ENTER MOVIE NAME");
				String movie=sc.nextLine();
				System.out.println("ENTER DIR NAME");
				String dir=sc.nextLine();
				System.out.println("ENTER RATING NAME");
				double rat=sc.nextDouble();
				arr[i]=new Movie(movie,dir,rat);
				}
				
				int choice;
				
				do {
					System.out.println("----MENU----");
					System.out.println("1. DISPLAY");
					System.out.println("2. RATING");
					System.out.println("3. SEARCH");
					System.out.println("4. EXIT");
					
					System.out.println("ENTER CHOICE :");
					choice=sc.nextInt();
					
					switch(choice) {
					case 1:
						displayDetails(arr);
						break;
						
					case 2:
						double rating1=sc.nextDouble();
						rating(arr, rating1);
						break;
						
					case 3:
						String director1=sc.next();
						search(arr,director1);
						break;
						
					case 4:
						System.out.println("THANK YOU !");
						break;
						
					default:
						System.out.println("INVALID");
							
						
					}
				}while(choice!=4);
			}
		}


}
