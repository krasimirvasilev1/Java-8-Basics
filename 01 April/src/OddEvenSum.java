import java.util.Scanner;

/**
 * Created by Krasi on 4/1/2017.
 */
public class OddEvenSum {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        Integer num = Integer.parseInt(console.nextLine());
        int sum = 0;
        int sum2 = 0;
        for (int i = 1; i <= num; i++) {
            Integer num1 = Integer.parseInt(console.nextLine());
            if (i % 2 == 0) {
                sum = sum + num1;
            } else if (i % 2 == 1) {
                sum2 = sum2 + num1;
            }
        }
        if (sum == sum2) {
            System.out.println("Yes");
            System.out.println("Sum = " + sum);
        } else {
            System.out.println("No");
            System.out.println("Diff = " + Math.abs(sum - sum2));

        }


    }
    }

