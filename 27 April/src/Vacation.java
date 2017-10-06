import java.util.Scanner;

/**
 * Created by Krasi on 4/28/2017.
 */
public class Vacation {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        Integer numoldpeople = Integer.parseInt(console.nextLine());
        Integer numstudents = Integer.parseInt(console.nextLine());
        Integer nights = Integer.parseInt(console.nextLine());
        String transport = console.nextLine();
        double nightcosts = nights*82.99;
        double transportcosts = 0;
        if (transport.equals("train")){
            transportcosts += numoldpeople * 24.99;
            transportcosts += numstudents * 14.99;
            transportcosts *= 2;
            if (numoldpeople+numstudents>50){
                transportcosts *= 0.50;
            }
        }
        else if (transport.equals("bus")){
            transportcosts += numoldpeople * 32.50;
            transportcosts += numstudents * 28.50;
            transportcosts *= 2;
        }
        else if (transport.equals("boat")){
            transportcosts += numoldpeople * 42.99;
            transportcosts += numstudents * 39.99;
            transportcosts *= 2;
        }
        else if (transport.equals("airplane")){
            transportcosts += numoldpeople * 70.00;
            transportcosts += numstudents * 50.00;
            transportcosts *= 2;
        }
        double commision = (transportcosts + nightcosts) * 0.10;
        System.out.printf("%.2f",nightcosts+transportcosts+commision);
    }
}
