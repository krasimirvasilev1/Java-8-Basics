import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Created by Krasi on 4/27/2017.
 */
public class MatchTickets {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        Double budjet = Double.parseDouble(console.nextLine());
        String bilet = console.nextLine();
        Integer numpeople = Integer.parseInt(console.nextLine());
        double priceticket = 0;
        double transportcosts = 0;
        DecimalFormat df = new DecimalFormat("0.00");
        if (bilet.equals("Normal")) {
            priceticket += 249.99;
            if (numpeople >= 1 && numpeople <= 4) {
                transportcosts = budjet * 0.75;
            } else if (numpeople > 4 && numpeople <= 9) {
                transportcosts = budjet * 0.60;
            } else if (numpeople > 9 && numpeople <= 24) {
                transportcosts = budjet * 0.50;
            } else if (numpeople > 24 && numpeople <= 49) {
                transportcosts = budjet * 0.40;
            } else if (numpeople > 49) {
                transportcosts = budjet * 0.25;
            }
        } else if (bilet.equals("VIP")) {
            priceticket += 499.99;
            if (numpeople >= 1 && numpeople <= 4) {
                transportcosts = budjet * 0.75;
            } else if (numpeople > 4 && numpeople <= 9) {
                transportcosts = budjet * 0.60;
            } else if (numpeople > 9 && numpeople <= 24) {
                transportcosts = budjet * 0.50;
            } else if (numpeople > 24 && numpeople <= 49) {
                transportcosts = budjet * 0.40;
            } else if (numpeople > 49) {
                transportcosts = budjet * 0.25;
            }
        }
        if (budjet - transportcosts > priceticket * numpeople) {
            System.out.println("Yes! You have " + df.format(Math.abs((budjet - transportcosts) - (priceticket * numpeople))) + " leva left.");
        } else {
            System.out.println("Not enough money! You need " + df.format(Math.abs((budjet - transportcosts) - (priceticket * numpeople))) + " leva.");
        }

    }
}
