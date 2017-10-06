import java.util.Scanner;

/**
 * Created by Krasi on 4/22/2017.
 */
public class NumbersFrom1ToN {
    public static void main(String[] args) {
        Scanner console = new Scanner (System.in);
        Integer n = Integer.parseInt(console.nextLine());
        for (int i = n ; i >=1 ;i-- ){
            System.out.println(i);
        }
    }
}
