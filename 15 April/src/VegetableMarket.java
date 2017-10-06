import java.util.Scanner;

/**
 * Created by Krasi on 4/16/2017.
 */
public class VegetableMarket {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        Double pricevegetable = Double.parseDouble(console.nextLine());
        Double pricefruit = Double.parseDouble(console.nextLine());
        Integer quantityvegetable = Integer.parseInt(console.nextLine());
        Integer quantityfruit = Integer.parseInt(console.nextLine());
        if ((pricevegetable >= 0.00 && pricevegetable <= 1000.00) && (pricefruit >= 0.00 && pricefruit <= 1000.00) && (quantityvegetable >= 0 && quantityvegetable <= 1000) && (quantityvegetable >= 0 && quantityvegetable <= 1000)) {
            Double vegetable = pricevegetable * quantityvegetable;
            Double fruit = pricefruit * quantityfruit;
            Double result = (fruit + vegetable) / 1.94;
            System.out.println(result);
        }
    }
}
