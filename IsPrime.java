import java.util.Scanner;

public class IsPrime {
    public static void main(String[] args) {
        int n;
        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        System.out.println("isPrime: " + isPrimeOptimized(n));

    }

    public static boolean isPrime(int n) {
        int cnt = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                cnt++;
            }
        }
        return cnt == 2;
    }

    /*
    * TC O(sqrt(n))*/
    public static boolean isPrimeOptimized(int n) {
        int cnt = 0;
        for (int i = 1; i*i <= n; i++) {
            if (n % i == 0) {
                cnt++;

                if((n/i)!=i){
                    cnt++;
                }
            }
        }
        return cnt == 2;
    }
}
