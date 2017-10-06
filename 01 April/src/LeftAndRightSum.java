import java.util.Scanner;

/**
 * Created by Krasi on 4/1/2017.
 */
public class LeftAndRightSum {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        Integer num = Integer.parseInt(console.nextLine());
        int sum = 0;
        for (int i = 0; i < num; i++) {
            Integer numbers = Integer.parseInt(console.nextLine());
            sum+=numbers;
        } int sum1 = 0;
        for (int i = 0; i < num; i++) {
            Integer numbers1 = Integer.parseInt(console.nextLine());
sum1 += numbers1;
        }
        if (sum==sum1){
            System.out.println("Yes ,sum = "+sum);}
            else{
                System.out.println("No, diff = "+Math.abs(sum-sum1));
        }
    }
}