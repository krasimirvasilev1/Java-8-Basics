import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Created by Krasi on 4/17/2017.
 */
public class OperationsWithNumbers {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        Integer num1 = Integer.parseInt(console.nextLine());
        Integer num2 = Integer.parseInt(console.nextLine());
        String operator = console.nextLine();
        char c = operator.charAt(1);
        System.out.println(c);
        if (num1 == 0 ){
            System.out.println("Cannot divide "+ num2+" by zero");
        }
        else if (num2 == 0 ){
            System.out.println("Cannot divide "+ num1+" by zero");
        }
        else if (operator.equals("+")) {
            int result = num1 + num2;
            if (result % 2 == 0) {
                System.out.println(num1 + " + " + num2 + " = " + result + " - " + "even");
            } else if (result % 2 == 1) {
                System.out.println(num1 + " + " + num2 + " = " + result + " - " + "odd");
            }
        }
        else if (operator.equals("-")) {
            int result = num1 - num2;
            if (result % 2 == 0) {
                System.out.println(num1 + " - " + num2 + " = " + result + " - " + "even");
            } else if (result % 2 == 1) {
                System.out.println(num1 + " - " + num2 + " = " + result + " - " + "odd");
            }
        }
        else if (operator.equals("*")) {
            int result = num1 * num2;
            if (result % 2 == 0) {
                System.out.println(num1 + " * " + num2 + " = " + result + " - " + "even");}
            else if (result % 2 == 1) {
                System.out.println(num1 + " * " + num2 + " = " + result + " - " + "odd");}
        }
        else if (operator.equals("/")) {
            double num = num1;
            double num3 = num2;
            double result = num / num3;
            DecimalFormat df = new DecimalFormat("0.00");
            System.out.println(num1+" / "+num2 + " = " + (df.format(result)));
        }
        else if (operator.equals("%")) {
            int result = num1 % num2;
            System.out.println(num1+" % "+num2+" = "+result);
        }

    }
}

