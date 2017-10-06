import java.util.Scanner;

/**
 * Created by Krasi on 4/22/2017.
 */
public class Factoriel {
    public static void main(String[] args) {
        Scanner console = new Scanner (System.in);
        Integer n = Integer.parseInt(console.nextLine());
        Integer j =1;
            for (int i = 1 ; i<=n; i++){
                j*=i;
        }
        System.out.println(j);
    }
}
