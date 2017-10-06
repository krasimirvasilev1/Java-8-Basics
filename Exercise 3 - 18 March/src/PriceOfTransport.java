import java.util.Scanner;

/**
 * Created by Krasi on 3/20/2017.
 */
public class PriceOfTransport {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int distance = Integer.parseInt(console.nextLine());
        String type = console.nextLine();
        if (type.equals("day")&& (distance<=20)){
                System.out.printf("%.2f",0.70 +0.79*distance);}
                else if (type.equals("night") && (distance<=20)){
            System.out.printf("%.2f",0.70 +0.90*distance);}
            else if (distance>20 && distance<=100) {
                System.out.printf("%.2f",0.09*distance);
            } else if (distance>100) {
                System.out.printf("%.2f",(0.06*distance));
            }
        }

    }
