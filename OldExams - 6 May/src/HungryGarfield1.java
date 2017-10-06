import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Created by Krasi on 5/6/2017.
 */
public class HungryGarfield1 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        Double money = Double.parseDouble(console.nextLine());
        Double dollarexchangerate = Double.parseDouble(console.nextLine());
        Double pricepizza = Double.parseDouble(console.nextLine());
        Double pricelazagna = Double.parseDouble(console.nextLine());
        Double pricesandwich = Double.parseDouble(console.nextLine());
        Integer quantitypizza = Integer.parseInt(console.nextLine());
        Integer quantitylazagna = Integer.parseInt(console.nextLine());
        Integer quantitysandwich = Integer.parseInt(console.nextLine());
        DecimalFormat df = new DecimalFormat("0.00");
        double spentmoney = (pricepizza/dollarexchangerate)*quantitypizza + (pricelazagna/dollarexchangerate)*quantitylazagna + (pricesandwich/dollarexchangerate)*quantitysandwich;
        if (money>=spentmoney){
            System.out.printf("Garfield is well fed, John is awesome. Money left: $"+df.format(money-spentmoney)+".");}
            else{
            System.out.printf("Garfield is hungry. John is a badass. Money needed: $"+df.format(spentmoney-money)+".");

            }
        }
        }

