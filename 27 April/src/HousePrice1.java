import java.util.Scanner;

/**
 * Created by Krasi on 4/29/2017.
 */
public class HousePrice1 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        Double smallestroom = Double.parseDouble(console.nextLine());
        Double kitchen = Double.parseDouble(console.nextLine());
        Double pricesquaremeter = Double.parseDouble(console.nextLine());
        double middleroom = smallestroom + smallestroom*0.10;
        double biggestroom = middleroom + middleroom*0.10;
        double bathroom = smallestroom*0.50;
        double allarea = smallestroom + kitchen+middleroom+biggestroom+bathroom;
        double all = (allarea+allarea*0.05)*pricesquaremeter;
        System.out.printf("%.2f",all);
    }
}
