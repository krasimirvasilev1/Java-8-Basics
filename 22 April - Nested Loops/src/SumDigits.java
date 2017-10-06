import java.util.Scanner;

/**
 * Created by Krasi on 4/22/2017.
 */
public class SumDigits {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        Integer n = Integer.parseInt(console.nextLine());
        int j = 0;
        int k = n;
        for (int i = 1; i<=k; i++){
            j+= k%10;
k = k /10;
        }
        System.out.println(j);
    }
}