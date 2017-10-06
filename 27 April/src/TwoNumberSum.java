import java.util.Scanner;

/**
 * Created by Krasi on 5/2/2017.
 */
public class TwoNumberSum {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        Integer num1 = Integer.parseInt(console.nextLine());
        Integer num2 = Integer.parseInt(console.nextLine());
        Integer magicnum = Integer.parseInt(console.nextLine());
        int combinations = 0;
        int reali = 0;
        int realj = 0;
        for (int i = num1; i >= num2; i--) {
            for (int j = num1; j >= num2; j--) {
                combinations++;
                if (i + j == magicnum) {
                    reali += i;
                    realj += j;
break;
                }
            }
            if (reali + realj == magicnum) {
                break;
            }
        }
            if (reali + realj == magicnum) {
                System.out.println("Combination N:" + combinations+" ("+reali + " + "+realj+ " = " + magicnum+")");
            } else {
                System.out.println(combinations + " combinations - neither equals " + magicnum);
            }
        }
    }
