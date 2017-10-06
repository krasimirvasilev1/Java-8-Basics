import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Created by Krasi on 4/18/2017.
 */
public class Harvest {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        Integer loze = Integer.parseInt(console.nextLine());
        Double grapefromarea = Double.parseDouble(console.nextLine());
        Integer neededwine = Integer.parseInt(console.nextLine());
        Integer numemployers = Integer.parseInt(console.nextLine());
        Double realloze = loze * 0.40;
        Double realgrapes = realloze * grapefromarea;
        Double realwine = realgrapes / 2.5;
        DecimalFormat df = new DecimalFormat("0");
        if (realwine<neededwine){
            System.out.println("It will be a tough winter! More "+df.format(Math.floor(neededwine-realwine)+" liters wine needed."));
        }
        else if (realwine>=neededwine){
            System.out.println("Good harvest this year! Total wine: "+df.format(Math.floor(realwine)+" liters."));
            System.out.println(df.format(Math.ceil(realwine-neededwine ))+" liters left -> "+df.format(Math.ceil(realwine-neededwine)/numemployers)+" liters per person.");
        }
    }
}
