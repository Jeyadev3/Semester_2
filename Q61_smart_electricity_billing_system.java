
import java.util.Scanner;
public class Q61_smart_electricity_billing_system {
    static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the units");
        int units=scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter whether it is late payment or not");
        String s=scanner.nextLine();
        int base=10;
        double bill=0;
        if(units<=100){
            bill=units*0.5+10;
        }
        else if(units>100 && units<=300){
            int x=units-100;
            bill=100*0.5+x*0.75+10;
        }
        else if (units>300) {

            int y=units-300;
            bill=100*0.5+200*0.75+y*1.2+10;
        }
        if (s.equals("late")){
            bill=bill+bill*0.05;
        }
        else{
            bill=bill;
        }
        System.out.println("The total bill is "+bill);
    }
}
