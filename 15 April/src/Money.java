import java.util.Scanner;

/**
 * Created by Krasi on 4/18/2017.
 */
public class Money {
    public static void main(String[] args) {
        Scanner console = new Scanner (System.in);
        Integer bitcoins = Integer.parseInt(console.nextLine());
        Double chinesemoney = Double.parseDouble(console.nextLine());
        Double commision = Double.parseDouble(console.nextLine());
        double eurobitcoins = (bitcoins *1168) / 1.95;
        double eurochinese = ((chinesemoney * 0.15) * 1.76)/1.95 ;
        double eurocommision = ((eurobitcoins+eurochinese)*commision)/100;
        if (commision >= 0 && commision<=5){
            System.out.println((eurobitcoins+eurochinese)-eurocommision);
        }

    }
}
