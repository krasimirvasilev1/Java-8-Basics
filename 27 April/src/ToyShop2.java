import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Created by Krasi on 5/7/2017.
 */
public class ToyShop2 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        Double pricetour = Double.parseDouble(console.nextLine());
        Integer puzzle = Integer.parseInt(console.nextLine());
        Integer talkingdolls = Integer.parseInt(console.nextLine());
        Integer teddybeers = Integer.parseInt(console.nextLine());
        Integer minions = Integer.parseInt(console.nextLine());
        Integer trucktoys = Integer.parseInt(console.nextLine());
        double puzzleprice = 2.60;
        double talkingdollsprice = 3;
        double teddybeerprice = 4.10;
        double minionprice = 8.20;
        double trucktoysprice = 2;
        double sum = puzzle*puzzleprice+talkingdolls*talkingdollsprice+teddybeers*teddybeerprice+minions*minionprice+trucktoys*trucktoysprice;
        DecimalFormat df = new DecimalFormat("0.00");
        if ((puzzle+talkingdolls+teddybeers+minions+trucktoys)>=50){
            sum =sum -  sum*0.25;
        }
        sum = sum - sum*0.10;
        if (sum>=pricetour){
            System.out.println("Yes! "+df.format(sum-pricetour)+" lv left.");
        }
        else {
            System.out.println("Not enough money! "+df.format(pricetour-sum)+" lv needed.");
        }
    }
}
