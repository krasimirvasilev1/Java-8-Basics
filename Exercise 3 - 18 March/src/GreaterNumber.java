import java.util.Scanner;

/**
 * Created by Krasi on 3/18/2017.
 */
public class GreaterNumber {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int a = Integer.parseInt(console.nextLine());
        int b = Integer.parseInt(console.nextLine());
        if (a >= b)
        {
            System.out.println(a);
        }
 else if (a < b)
        {
            System.out.println(b);
        }
    }
}

