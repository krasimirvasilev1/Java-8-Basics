import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Created by Krasi on 4/18/2017.
 */
public class LilysAge {
    public static void main(String[] args) {
        Scanner console = new Scanner (System.in);
        Integer LilyAge = Integer.parseInt(console.nextLine());
        Double PriceWasher = Double.parseDouble(console.nextLine());
        Integer PriceToy = Integer.parseInt(console.nextLine());
        Integer toy = 0;
        Integer moneyfornow = 0;
        DecimalFormat df = new DecimalFormat("0.00");
        for (int i = 1; i <= LilyAge;i++){
            if (i % 2 == 1){
                toy+=1;
            }
            else if (i % 2 == 0){
                    moneyfornow+=(i*5);
                    moneyfornow-=1;
            }
        }
        Integer toymoney = toy*PriceToy;
        Integer Allmoney = toymoney + moneyfornow;
        if (Allmoney<PriceWasher){
            System.out.printf("No! "+df.format(PriceWasher-Allmoney));
        } else if (Allmoney >= PriceWasher) {
            System.out.println("Yes! "+df.format(Allmoney-PriceWasher));
        }

    }
}
