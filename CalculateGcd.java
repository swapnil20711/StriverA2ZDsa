import java.util.Scanner;

public class CalculateGcd {
    public static void main(String[] args) {
        int a, b;
        System.out.println("Enter the value of a and b: ");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();

        System.out.println("GCD of " + a + " and " + b + " = " + gcd(a, b));

    }

    public static int gcd(int a, int b) {
        while (a > 0 && b > 0) {
            if (a > b) {
                a = a % b;
            } else {
                b = b % a;
            }
        }

        if (a == 0) {
            return b;
        } else {
            return a;
        }
    }
}
