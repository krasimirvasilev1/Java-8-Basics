import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Created by Krasi on 4/7/2017.
 */
public class DelenieBezOstatuk {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        Integer n = Integer.parseInt(console.nextLine());
        double p1 = 0.0;
        double p2 = 0.0;
        double p3 = 0.0;
        DecimalFormat format =new DecimalFormat("0.00");
        for (int i=0;i<n;i++){
            Integer num = Integer.parseInt(console.nextLine());
            if (num % 2 == 0 && num % 4 == 0 && num % 3 ==0  ){
                p1 += 1;
                p2 += 1;
                p3 += 1;}
            else if (num % 3 == 0 && num % 2 == 0){
                p1 += 1;
                p2 += 1;}
            else if (num % 2 == 0 && num % 4 ==0 ){
                p1 += 1;
                p3 += 1;}
            else if (num % 3 == 0){
                p2 += 1 ;}
            else if (num % 4 == 0){
                p3 += 1 ;}
            else if (num % 2 == 0 ){
                p1 +=1 ;
            }

            }
            double a = (p1/n)*100;
            double b = (p2/n)*100;
            double c = (p3/n)*100;
        System.out.printf("%s%n",format.format(a)+"%");
        System.out.printf("%s%n",format.format(b)+"%");
        System.out.printf("%s%n",format.format(c)+"%");

        }
    }

