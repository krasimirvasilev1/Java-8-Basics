import java.util.Scanner;

/**
 * Created by Krasi on 4/22/2017.
 */
public class FibonachiNumber {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        Integer number = Integer.parseInt(console.nextLine());
        Integer n = 1;
        Integer n1 = 1;
        if (number < 2) {
            System.out.println(n);
        return;}
            for (int i = 2 ; i<=number;i++){
             int numbernext = n+n1;
            n = n1;
            n1 = numbernext;
            }
        System.out.println(n1);

            }
        }


