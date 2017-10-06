import java.util.Scanner;

/**
 * Created by Krasi on 4/2/2017.
 */
public class MaxNumber {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        Integer n = Integer.parseInt(console.nextLine());
        int max = Integer.MIN_VALUE;
        for (int i=0;i<n;i++){
            Integer num = Integer.parseInt(console.nextLine());
            if (num>max){
                max=num;

            }
        }
        System.out.println(max);
    }
}
