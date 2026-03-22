import java.util.Scanner;
public class Q45_sum_of_two_primes {
    static boolean isPrime(int x) {
        if (x < 2) return false;
        for (int i = 2; i * i <= x; i++) {
            if (x % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();  // 16

        for (int p = 2; p <= n / 2; p++) {
            int q = n - p;
            if (isPrime(p) && isPrime(q)) {
                System.out.println(n + "=" + p + "+" + q);
            }
        }

        sc.close();
    }
}
