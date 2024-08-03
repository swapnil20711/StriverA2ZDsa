import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class AllDivisors {
    public static void main(String[] args) {
        int n;
        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        System.out.println(sumOfDivisors2(n));
    }

    public static List<Integer> printAllDivisors(int n) {
        List<Integer> res = new ArrayList<>();
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                res.add(i);

                if (n / i != i) {
                    res.add(n / i);
                }
            }
        }
        Collections.sort(res);
        return res;
    }

    static long sumOfDivisors(int N) {
        // code here
        long sum = 0;
        for (int num = 1; num <= N; num++) {
            for (int i = 1; i*i <= num; i++) {
                if (num % i == 0) {
                    sum += i;
                    if (num / i != i) {
                        sum += (num / i);
                    }
                }
            }
        }
        return sum;
    }

    /*
    * Optimized approach
    * 1 has [1]  Value 1 time 6 (N/i)==> (6/1)=6 and to get the value sum we multiply with i => 6
    * 2 has [1,2] Value 2 time 3 (N/i)==> (6/2)=3 => 3*2=6
    * 3 has [1,3] Value 3 time 2 (N/i)==> (6/3)=3 => 2*3=6
    * 4 has [1,2,4] Value 4 time 1  (N/i)==> (6/4)=1 => 4*1=4
    * 5 has [1,5]   Value 5 time 1  (N/i)==> (6/5)=1 => 5*1=5
    * 6 has [1,2,3,6] Value 6 time 1  (N/i)==> (6/6)=1 => 6*1=6
    * Answer would be 6+6+6+4+5+6=33
    * */

    static long sumOfDivisors2(int N) {
        long sum = 0;
        for (int i = 1; i <= N; i++) {
            sum += (long) (N / i) *i;
        }

        return sum;
    }
}
