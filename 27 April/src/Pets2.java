import java.util.Scanner;

/**
 * Created by Krasi on 4/28/2017.
 */
public class Pets2 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        Integer days = Integer.parseInt(console.nextLine());
        Integer leftfoodinkilos = Integer.parseInt(console.nextLine());
        Double foodperdaydog = Double.parseDouble(console.nextLine());
        Double foodperdaycat = Double.parseDouble(console.nextLine());
        Double foodperdayturtle = Double.parseDouble(console.nextLine());
        double foodneeded = foodperdaydog *days + foodperdaycat*days + (foodperdayturtle/1000)*days;
        if (leftfoodinkilos>=foodneeded){
            System.out.println((int)Math.floor(leftfoodinkilos-foodneeded)+" kilos of food left.");
        }
        else {
            System.out.println((int)Math.ceil(foodneeded-leftfoodinkilos)+" more kilos of food are needed.");
        }
    }
}
