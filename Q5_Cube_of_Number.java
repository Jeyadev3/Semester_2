import java.util.Scanner;
public class Q5_Cube_of_Number {
        public static void main(String[] args) {
            Scanner scanner=new Scanner(System.in);
            int j = scanner.nextInt();
            int cube = (int) Math.pow(j,3);
            System.out.println("The cube of the given number is: "+cube);
            scanner.close();
        }
}