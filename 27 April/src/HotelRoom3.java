import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Created by Krasi on 4/27/2017.
 */
public class HotelRoom3 {
        public static void main(String[] args) {
            Scanner console = new Scanner(System.in);
            String month = console.nextLine();
            Integer nights = Integer.parseInt(console.nextLine());
            Double priceStudio = 0.0;
            Double priceApartament = 0.0;
            Double discountStudio = 0.0;
            Double discountApartament = 0.0;
            DecimalFormat df = new DecimalFormat("0.00");
            if (month.equals("May") || month.equals("October")) {
                priceApartament += 65;
                priceStudio += 50;
                {
                    if (nights > 7 && nights < 14) {
                        discountStudio = priceStudio * 0.05;
                    } else if (nights > 14) {
                        discountStudio = priceStudio * 0.30;
                        discountApartament = priceApartament * 0.10;
                    }
                }
            } else if (month.equals("June") || month.equals("September")) {
                priceApartament += 68.70;
                priceStudio += 75.20;
                {
                    if (nights > 14) {
                        discountStudio = priceStudio * 0.20;
                        discountApartament = priceApartament * 0.10;
                    }

                }
            } else if (month.equals("July") || month.equals("August")) {
                priceApartament += 77.00;
                priceStudio += 76.00;
                {
                    if (nights > 14) {
                        discountApartament = priceApartament * 0.10;
                    }
                }
            }
            Double realcostStudio = (priceStudio*nights)-(discountStudio*nights);
            Double realcostApartament = (priceApartament*nights)-(discountApartament*nights);
            System.out.println("Apartment: "+df.format(realcostApartament)+" lv.");
            System.out.println("Studio: "+df.format(realcostStudio)+" lv.");
        }
    }

