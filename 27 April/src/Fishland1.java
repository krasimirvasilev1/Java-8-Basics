import java.util.Scanner;

/**
 * Created by Krasi on 4/28/2017.
 */
public class Fishland1 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        Double priceskumriq = Double.parseDouble(console.nextLine());
        Double pricecaca = Double.parseDouble(console.nextLine());
        Double palamud = Double.parseDouble(console.nextLine());
        Double safrid = Double.parseDouble(console.nextLine());
        Integer midi = Integer.parseInt(console.nextLine());
        double pricepalamud = palamud * (priceskumriq*1.60);
        double pricesafrid = safrid * (pricecaca*1.80);
        double pricemidi = midi*7.50;
        System.out.printf("%.2f",pricepalamud+pricesafrid+pricemidi);

    }
}
