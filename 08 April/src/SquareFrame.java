import java.util.Scanner;

/**
 * Created by Krasi on 4/8/2017.
 */
public class SquareFrame {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());
        // Top
        System.out.printf("+ %s+%n",repeatStr("- ",n-2));
for (int i = 1;i<n-1;i++){
    System.out.printf("| %s|%n",repeatStr("- ",n-2));
}


        // Bottom
        System.out.printf("+ %s+%n",repeatStr("- ",n-2));



    }
    static String repeatStr (String strToRepeat, int count){
        String text = "";
        for (int i = 0;i<count;i++){
            text= text +strToRepeat;
        }
        return text;
    }
}
