import java.util.Scanner;

public class Q46_ndigit_armstrong {
    static int powInt(int base, int exp) {
        int res = 1;
        for (int i = 1; i <= exp; i++) res *= base;
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();   // 1634

        int temp = n;
        int digits = 0;
        while (temp > 0) {
            digits++;
            temp /= 10;
        }

        temp = n;
        int sum = 0;
        while (temp > 0) {
            int d = temp % 10;
            sum += powInt(d, digits);
            temp /= 10;
        }

        if (sum == n)
            System.out.println(n + " is an Armstrong number.");
        else
            System.out.println(n + " is not an Armstrong number.");

        sc.close();
    }
}