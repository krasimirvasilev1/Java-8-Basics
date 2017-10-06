import java.util.Scanner;

/**
 * Created by Krasi on 4/22/2017.
 */
public class ExersiceForSimpleNumber {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        Integer n = Integer.parseInt(console.nextLine());
        boolean IsPrime = true;
        if (n < 2) {
            System.out.println("Not Prime");
        } else {
            for (int i = 2; i <=Math.sqrt(n) ; i++) {
                if (n % i == 0) {
                    IsPrime = false;
                    break;
                }
                }
                if (IsPrime){
                    System.out.println("Prime");}
                    else{
                    System.out.println("Not Prime");
                }
            }
        }
    }
