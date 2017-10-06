import java.util.Scanner;

/**
 * Created by Krasi on 4/24/2017.
 */
public class TableWithNumbers {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                int num = row + col + 1;
                if (num > n)
                {num = 2 * n - num; }
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
