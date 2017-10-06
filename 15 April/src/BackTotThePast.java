import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Created by Krasi on 4/27/2017.
 */
public class BackTotThePast {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        Double money = Double.parseDouble(console.nextLine());
        Integer year = Integer.parseInt(console.nextLine());
        int ivancho = 18;
        int startingyear = 1800;
        double realmoney = money;
        DecimalFormat df = new DecimalFormat("0.00");
        for (int i = startingyear;i<=year;i++){
            if (i % 2 == 0){
                realmoney -=12000;
            }
            else if(i % 2 == 1){
                realmoney -=12000 + 50*ivancho;
            }
            ivancho++;
        }
        if (realmoney >= 0){
            System.out.println("Yes! He will live a carefree life and will have "+df.format(Math.abs(realmoney))+" dollars left.");
        }
        else {
            System.out.println("He will need "+df.format(Math.abs(realmoney))+" dollars to survive.");
        }


    }
}
