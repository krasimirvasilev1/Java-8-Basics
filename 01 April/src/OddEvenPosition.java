import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Created by Krasi on 4/3/2017.
 */
public class OddEvenPosition {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        Integer numinput = Integer.parseInt(console.nextLine());
        Double OddSum = 0.0;
        Double OddMin = 1000000000.0;
        Double OddMax = -1000000000.0;
        Double EvenSum = 0.0;
        Double EvenMin = 1000000000.0;
        Double EvenMax = -1000000000.0;
        double numberdecimal = 0;
        for (int i = 1; i <= numinput; i++) {
            Double number = Double.parseDouble(console.nextLine());
            if (i % 2 == 1) {
                OddSum += number;
                if (number < OddMin) {
                    OddMin = number;
                } if (number > OddMax) {
                    OddMax = number;
                }
            }
            if (i % 2 == 0) {
                EvenSum += number;
                if (number < EvenMin) {
                    EvenMin = number;
                } if(number > EvenMax) {
                    EvenMax = number;
                }
                }
            }

        DecimalFormat format = new DecimalFormat("#.###############");

        if (numinput == 0){
        System.out.printf("OddSum=%s%n",format.format(OddSum));
        System.out.println("OddMin=No");
        System.out.println("OddMax=No");
        System.out.printf("EvenSum=%s%n",format.format(EvenSum));
        System.out.println("EvenMin=No");
            System.out.println("EvenMax=No");}
            else if (numinput == 1 ){
            System.out.printf("OddSum=%s%n",format.format(OddSum));
            System.out.printf("OddMin=%s%n",format.format(OddMin));
            System.out.printf("OddMax=%s%n",format.format(OddMax));
            System.out.println("EvenSum=0");
            System.out.println("EvenMin=No");
            System.out.println("EvenMax=No");
        }

            else{
                System.out.printf("OddSum=%s%n",format.format(OddSum));
                System.out.printf("OddMin=%s%n",format.format(OddMin));
                System.out.printf("OddMax=%s%n",format.format(OddMax));
                System.out.printf("EvenSum=%s%n",format.format(EvenSum));
                System.out.printf("EvenMin=%s%n",format.format(EvenMin));
                System.out.printf("EvenMax=%s%n",format.format(EvenMax));
            }

        }

        }



