import java.util.Scanner;

/**
 * Created by Krasi on 4/30/2017.
 */
public class ControlNumber6 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        Integer n = Integer.parseInt(console.nextLine());
        Integer m = Integer.parseInt(console.nextLine());
        Integer controlnumber = Integer.parseInt(console.nextLine());
        int sum = 0;
        int moves = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = m; j >= 1; j--) {
                sum += i * 2 + j * 3;
                moves++;
                if (sum >= controlnumber) {
                    break;
                }
            }
        }
        if (sum < controlnumber) {
            System.out.println(moves + " moves");
        } else {
            System.out.println(moves + " moves");
            System.out.println("Score: " + sum + " >= " + controlnumber);
        }
    }
}
