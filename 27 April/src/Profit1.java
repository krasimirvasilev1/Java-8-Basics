import java.util.Scanner;

/**
 * Created by Krasi on 4/27/2017.
 */
public class Profit1 {
    public static void main(String[] args) {
        Scanner console = new Scanner (System.in);
        Integer dayinmonth = Integer.parseInt(console.nextLine());
        Double moneyperday = Double.parseDouble(console.nextLine());
        Double coursedollar = Double.parseDouble(console.nextLine());
        double realmoneypermonth = moneyperday * dayinmonth;
        double realmoney = (realmoneypermonth*2.5 + realmoneypermonth*12);
        double taxes = realmoney * 0.25;
        double profitinleva = ((realmoney - taxes) * coursedollar) / 365;
        System.out.printf("%.2f",profitinleva);
    }
}
