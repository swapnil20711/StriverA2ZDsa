import java.util.Scanner;

public class IsArmstrong {
    public static void main(String[] args) {
        int n;
        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        System.out.println("isArmstrong: " + isArmstrong(n));
    }

    public static boolean isArmstrong(int n) {
        int k = String.valueOf(n).length();
        int res = 0;
        int originalNumber = n;
        while (n != 0) {
            int ld = n % 10;
            res = (int) (res + Math.pow(ld, k));
            n = n / 10;
        }
        return res == originalNumber;
    }
}
