import java.util.Scanner;

/**
 * Created by Krasi on 4/27/2017.
 */
public class StopNumber {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        Integer n = Integer.parseInt(console.nextLine());
        Integer m = Integer.parseInt(console.nextLine());
        Integer s = Integer.parseInt(console.nextLine());
        Integer max = Integer.max(n,m);
        Integer min = Integer.min(n,m);
        for (int i = max; i>=min;i--){
            if (i % 2 == 0 && i % 3 == 0 && i == s){
                break;}
            else if (i % 2 == 0 && i % 3 == 0) {
                System.out.print(i);
                System.out.print(" ");
            }
            }

        }
    }

