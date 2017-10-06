import java.util.Scanner;

/**
 * Created by Krasi on 4/22/2017.
 */
public class TheBiggestDividerBetweenTwoNumbers {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        Integer n = Integer.parseInt(console.nextLine());
        Integer m = Integer.parseInt(console.nextLine());
        Integer greaterNum = Integer.max(n, m);
        int gcd = Integer.MIN_VALUE;
        for (int i = 1; i <= greaterNum; i++) {
            if (n % i == 0 && m % i == 0) {
                gcd = i;
            }
        }
        System.out.println(gcd);
    }
}
