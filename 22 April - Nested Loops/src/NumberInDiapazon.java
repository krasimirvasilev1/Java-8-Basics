import java.util.Scanner;

/**
 * Created by Krasi on 4/22/2017.
 */
public class NumberInDiapazon {
    public static void main(String[] args) {
        Scanner console = new Scanner (System.in);
        Integer n = Integer.parseInt(console.nextLine());
        while(n<1 || n>100){
            System.out.println("Invalid number!");
            n = Integer.parseInt(console.nextLine());

        }
        System.out.println("The number is:"+n);
    }
}
