import java.util.Scanner;

/**
 * Created by Krasi on 4/29/2017.
 */
public class FlowerShop2 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        Integer magnoliiCount = Integer.parseInt(console.nextLine());
        Integer zumbuliCount = Integer.parseInt(console.nextLine());
        Integer rosesCount = Integer.parseInt(console.nextLine());
        Integer cactusCount = Integer.parseInt(console.nextLine());
        Double presentprice = Double.parseDouble(console.nextLine());
        double magnoliiPrice = magnoliiCount*3.25;
        double zumbuliPrice = zumbuliCount*4;
        double rosesPrice = rosesCount*3.50;
        double cactusPrice = cactusCount*8;
        double orderPrice = magnoliiPrice+zumbuliPrice+rosesPrice+cactusPrice;
        double clearprofit = orderPrice - orderPrice*0.05;
        if (clearprofit>presentprice){
            System.out.println("She is left with "+(int)Math.abs(Math.floor(clearprofit-presentprice))+" leva.");
    }
        else if (presentprice> clearprofit){
            System.out.println("She will have to borrow "+(int)Math.abs(Math.ceil(presentprice-clearprofit))+" leva.");
        }
    }
}
