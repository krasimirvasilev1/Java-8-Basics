import java.text.DecimalFormat;
import java.util.DoubleSummaryStatistics;
import java.util.Scanner;

class   MetricConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double numb = Double.parseDouble(scanner.nextLine());
        String input = scanner.nextLine();
        String output = scanner.nextLine();
        if (input.equals("mm")) {
            numb /= 1000;
        } else if (input.equals("cm")) {
            numb /= 100;
        } else if (input.equals("mi")) {
            numb /= 0.000621371192;
        } else if (input.equals("in")) {
            numb /= 39.3700787;
        } else if (input.equals("km")) {
            numb /= 0.001;
        } else if (input.equals("ft")) {
            numb /= 3.2808399;
        } else if (input.equals("yd")) {
            numb /= 1.0936133;
        }

        if (output.equals("mm")) {
            numb *= 1000;
        } else if (output.equals("cm")) {
            numb *= 100;
        } else if (output.equals("mi")) {
            numb *= 0.000621371192;
        } else if (output.equals("in")) {
            numb *= 39.3700787;
        } else if (output.equals("km")) {
            numb *= 0.001;
        } else if (output.equals("ft")) {
            numb *= 3.2808399;
        } else if (output.equals("yd")) {
            numb *= 1.0936133;
        }

        DecimalFormat df = new DecimalFormat("0.#######") ;
        System.out.println(df.format(numb) + " " + output);
    }
}