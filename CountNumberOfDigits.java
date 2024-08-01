import java.util.Scanner;

public class CountNumberOfDigits {
    public static void main(String[] args) {
        int n;
        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        System.out.println("Number of digits in " + n + " is: " + countNumberOfDigits(n, 0));
        System.out.println("Number of digits in " + n + " is: " + countNumberOfDigits(n));
    }

    /*
    * Brute force approach
    * */
    private static int countNumberOfDigits(int n, int count) {
        if (n != 0) {
            return countNumberOfDigits(n / 10, count + 1);
        }
        return count;
    }

    /*
     * Optimal approach
     * */
    private static int countNumberOfDigits(int n) {
        return (int) (Math.floor(Math.log10(n))+1);
    }
}
