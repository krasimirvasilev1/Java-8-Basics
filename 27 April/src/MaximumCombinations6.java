import java.util.Scanner;

/**
 * Created by Krasi on 5/4/2017.
 */
public class MaximumCombinations6 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        Integer firstnum = Integer.parseInt(console.nextLine());
        Integer secondnum = Integer.parseInt(console.nextLine());
        Integer maxcombinations = Integer.parseInt(console.nextLine());
        int combinations = 0;
        for (int i = firstnum; i <= secondnum; i++) {
            for (int j = firstnum; j <= secondnum; j++) {
                if (combinations >= maxcombinations) {
                    break;
                }
                else{
                    System.out.print("<"+i+"-"+j+">");
                }
                combinations++;
            }
            if (combinations >= maxcombinations) {
                break;
            }
        }
    }
}
