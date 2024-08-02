import java.math.BigDecimal;
import java.util.Objects;
import java.util.Scanner;

public class IsPalindrome {
    public static void main(String[] args) {
        int n;
        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        System.out.println("IsPalindrome: " + isPalindrome(n));
    }

    public static boolean isPalindrome(int x) {
        int reverseNumber = 0;
        int originalNumber = x;
        while (x != 0) {
            reverseNumber = reverseNumber * 10 + x % 10;
            x = x / 10;
        }
        return originalNumber > 0 && reverseNumber == originalNumber || originalNumber==0;
    }
}
