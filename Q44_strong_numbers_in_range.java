import java.util.Scanner;

public class Q44_strong_numbers_in_range {
    static int fact(int d) {
        int f = 1;
        for (int i = 2; i <= d; i++) f *= i;
        return f;
    }

    static boolean isStrong(int n) {
        int temp = n;
        int sum = 0;

        while (temp > 0) {
            int digit = temp % 10;
            sum += fact(digit);
            temp /= 10;
        }
        return sum == n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();  // 1
        int end = sc.nextInt();    // 200

        for (int i = start; i <= end; i++) {
            if (isStrong(i)) System.out.print(i + " ");
        }

        sc.close();
    }
}