import java.util.Scanner;

/**
 * Created by Krasi on 3/20/2017.
 */
public class proba {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        Integer num = Integer.parseInt(console.nextLine());
        Integer num1 = Integer.parseInt(console.nextLine());
        Integer num2 = Integer.parseInt(console.nextLine());
        if (num == num1 && num1 == num2) {
            System.out.println("yes");
        }
else {
            System.out.println("no");
        }
    }
}