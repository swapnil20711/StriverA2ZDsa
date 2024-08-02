import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        int n;
        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        System.out.println("Reversed number is " + reverse(n));
    }

    public static int reverse(int x) {
        long reversedNumber = 0;
        while (x != 0) {
            reversedNumber = reversedNumber * 10 + x % 10;
            x = x/10;
        }
        return (reversedNumber>Integer.MAX_VALUE || reversedNumber<Integer.MIN_VALUE)?0:(int)reversedNumber;
    }
}
