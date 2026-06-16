package questions;

public class DiamondPattern {

    public static void main(String[] args) {
        int n = 5;  
        for (int i = 1; i <= n; i++) {
            
        	for (int space = i; space < n; space++) {
                System.out.print(" ");
            }

            for (int star = 1; star <= (2 * i - 1); star++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = n - 1; i >= 1; i--) {
            for (int space = n; space > i; space--) {
                System.out.print(" ");
            }

            for (int star = 1; star <= (2 * i - 1); star++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
