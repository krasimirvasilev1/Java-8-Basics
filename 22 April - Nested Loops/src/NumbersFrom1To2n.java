import java.util.Scanner;

/**
 * Created by Krasi on 4/22/2017.
 */
public class NumbersFrom1To2n {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        Integer n = Integer.parseInt(console.nextLine());
        int j = 2;
        System.out.println(1);
            for (int i = 1;i <= n;i++){
                System.out.println(j);
                j*=2;
            }
        }
    }


