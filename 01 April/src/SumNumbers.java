import java.util.Scanner;

/**
 * Created by Krasi on 4/1/2017.
 */
public class SumNumbers {
    public static void main(String[] args) {
        Scanner console = new Scanner (System.in);
        Integer n = Integer.parseInt(console.nextLine());
        int sum = 0;
        for (int i = 0;i<n;i++ ){
            Integer num = Integer.parseInt(console.nextLine());
            sum= sum+num;}
        System.out.println(sum);
    }

}

