import javax.swing.*;
import java.util.Scanner;

/**
 * Created by Krasi on 4/30/2017.
 */
public class TruckDriver3 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String season = console.nextLine();
        Double kilometrespermonths = Double.parseDouble(console.nextLine());
        double sum = 0;
        if (season.equals("Spring") || season.equals("Autumn")) {
            if (kilometrespermonths <= 5000) {
                sum += kilometrespermonths * 0.75;
            } else if (kilometrespermonths > 5000 && kilometrespermonths <= 10000) {
                sum += kilometrespermonths * 0.95;
            } else if (kilometrespermonths > 10000 && kilometrespermonths <= 20000) {
                sum += kilometrespermonths * 1.45;
            }
        }
        if (season.equals("Summer")) {
            if (kilometrespermonths <= 5000) {
                sum += kilometrespermonths * 0.90;
            }
         else if (kilometrespermonths > 5000 && kilometrespermonths <= 10000) {
            sum += kilometrespermonths * 1.10;
        } else if (kilometrespermonths > 10000 && kilometrespermonths <= 20000) {
            sum += kilometrespermonths * 1.45;
        }
    }
        if (season.equals("Winter")) {
            if (kilometrespermonths <= 5000){
                sum += kilometrespermonths * 1.05;}
            else if (kilometrespermonths > 5000 && kilometrespermonths <= 10000) {
                sum += kilometrespermonths * 1.25;
            } else if (kilometrespermonths > 10000 && kilometrespermonths <= 20000) {
                sum += kilometrespermonths * 1.45;
            }
        }
        System.out.printf("%.2f",sum*4 - (sum*4)*0.10);
    }
}