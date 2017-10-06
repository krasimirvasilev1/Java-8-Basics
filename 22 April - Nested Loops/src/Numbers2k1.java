import java.util.Scanner;

/**
 * Created by Krasi on 4/22/2017.
 */
public class Numbers2k1 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        Integer n = Integer.parseInt(console.nextLine());
        Integer k = 1;
        while (k<=n){
            System.out.println(k);
            k=k*2+1;
        }

    }
}
