import java.util.Scanner;

/**
 * Created by Krasi on 4/29/2017.
 */
public class BikeRace {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        Integer juniorbikers =  Integer.parseInt(console.nextLine());
        Integer seniorbikers = Integer.parseInt(console.nextLine());
        String typerace = console.nextLine();
        double result = 0 ;
        if (typerace.equals("trail")){
            result += juniorbikers*5.50 + seniorbikers*7;
            result = result - result*0.05;
        } else if (typerace.equals("cross-country")){
            result += juniorbikers*8 + seniorbikers*9.50;
            if (juniorbikers+seniorbikers>=50){
                result -= result*0.25;
            }
            result = result - result*0.05;
        }
            else if (typerace.equals("downhill")){
                result += juniorbikers*12.25 + seniorbikers*13.75;
                result = result - result*0.05;}
                else if (typerace.equals("road")){
                    result += juniorbikers*20+ seniorbikers*21.50;
                    result = result - result*0.05;}
        System.out.printf("%.2f",result);
    }
}
