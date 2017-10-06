import java.util.Scanner;

/**
 * Created by Krasi on 4/1/2017.
 */
public class HalfSumElement {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        Integer n = Integer.parseInt(console.nextLine());
        int sum = 0;
        int sum1 = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            int number = Integer.parseInt(console.nextLine());
            sum += number;
            if (number>sum1){
                sum1=number ;}
            }
            sum = sum -sum1;
       if (sum == sum1){
           System.out.println("Yes");
           System.out.println("Sum = "+sum);
       }
       else{
           System.out.println("No");
           System.out.println("Diff = "+Math.abs(sum1 - sum));
       }
        }

    }



