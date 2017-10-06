
import java.util.Scanner;

/**
 * Created by Krasi on 3/19/2017.
 */
public class SumSeconds {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int player1 = Integer.parseInt(console.nextLine());
        int player2 = Integer.parseInt(console.nextLine());
        int player3 = Integer.parseInt(console.nextLine());
        int sum = player1+player2+player3;
        int min = 0;
        int sec = 0;
        if (sum>=60){
            min = sum/60;
        }
        sec = sum % 60;
        if (sum<10){
            System.out.printf(min+":0"+sum);}
        else{
            System.out.printf(min+":"+"%02d",sec);

        }
    }}