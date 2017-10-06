import java.util.Scanner;

/**
 * Created by Krasi on 3/19/2017.
 */
public class Time15minutes {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        Integer one = Integer.parseInt(console.nextLine());
        Integer two = Integer.parseInt(console.nextLine());
        int min = 15 + two;
        if (one>=23 && two>=45){
            System.out.printf(0+":"+"%02d",min-60);}
        else if (min >= 60) {
            one++;
            System.out.printf(one+":"+"%02d",min -60);}
            else if (min<60){
            System.out.println(one+":"+min);}



        }
    }

