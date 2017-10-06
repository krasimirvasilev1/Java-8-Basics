import java.util.Scanner;

/**
 * Created by Krasi on 4/2/2017.
 */
public class MinNumber {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        Integer n =Integer.parseInt(console.nextLine());
        int min = Integer.MAX_VALUE;
        for (int i=0;i<n;i++){
            Integer num = Integer.parseInt(console.nextLine());
            if (num<min){
                min=num;
            }

        }
        System.out.println(min);
    }
}
