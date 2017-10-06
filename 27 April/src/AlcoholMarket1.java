import java.util.Scanner;

/**
 * Created by Krasi on 5/7/2017.
 */
public class AlcoholMarket1 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        Double wiskeyprice = Double.parseDouble(console.nextLine());
        Double beer = Double.parseDouble(console.nextLine());
        Double wine = Double.parseDouble(console.nextLine());
        Double rakia = Double.parseDouble(console.nextLine());
        Double wiskey = Double.parseDouble(console.nextLine());
        double rakiaprice = wiskeyprice*0.50;
        double wineprice = rakiaprice- rakiaprice*0.40;
        double beerprice = rakiaprice - rakiaprice*0.80;
        double sum = wiskeyprice*wiskey+beerprice*beer+rakiaprice*rakia+wineprice*wine;
        System.out.printf("%.2f",sum);
    }
}
