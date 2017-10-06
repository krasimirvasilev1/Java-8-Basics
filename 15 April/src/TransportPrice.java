import java.util.Scanner;

/**
 * Created by Krasi on 4/16/2017.
 */
public class TransportPrice {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        Integer n = Integer.parseInt(console.nextLine());
        String type = console.nextLine();
        Double taxi = 0.70;
        if (20 > n && type.equals("day")){
            System.out.println(taxi+(0.79*n));
        }
        else if (20 > n && type.equals("night")){
            System.out.println(taxi+(0.90*n));
        }
        if (20 <= n && n <100){
            System.out.println(0.09*n);}
            if (n>=100){
                System.out.println(0.06*n);
            }
    }
}
