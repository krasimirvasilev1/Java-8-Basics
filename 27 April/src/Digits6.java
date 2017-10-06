import java.util.Scanner;

/**
 * Created by Krasi on 4/28/2017.
 */
public class Digits6 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        Integer n = Integer.parseInt(console.nextLine());
        int moduledivide5and3 =n % 100;
        int moduledivideother =n % 10;
        int firstnumber = 0;
        double secondnumber = 0;
        int thirdnumber = 0;
        double finalnumber = n;
        firstnumber += (n-moduledivide5and3) / 100;
        secondnumber +=Math.floor(moduledivide5and3 / 10);
        thirdnumber += n % 10;
        for (int i = 1; i <=firstnumber+secondnumber;i++){
            for (int j =1; j<=firstnumber+thirdnumber;j++){
                if (finalnumber%5==0){
                    finalnumber -= firstnumber;
                }
                else if (finalnumber%3==0){
                    finalnumber -= secondnumber;
                }
                else{
                    finalnumber += thirdnumber;
                }
                System.out.print((int)finalnumber);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
