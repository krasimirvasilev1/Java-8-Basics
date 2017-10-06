import java.util.Scanner;

/**
 * Created by Krasi on 4/27/2017.
 */
public class Hospital4 {
        public static void main(String[] args) {
            Scanner console = new Scanner (System.in);
            Integer n = Integer.parseInt(console.nextLine());
            int doctors = 7;
            int treatedpatients = 0;
            int untreatedpatients = 0;
            for (int i = 1;i<=n;i++){
                Integer patients = Integer.parseInt(console.nextLine());
                if (i % 3 == 0 && untreatedpatients>treatedpatients ){
                    doctors++;
                }
                if (patients<=doctors){
                    treatedpatients += patients;
                }
                else if (patients>doctors){
                    untreatedpatients += patients - doctors;
                    treatedpatients+=doctors;
                }

            }
            System.out.println("Treated patients: "+treatedpatients+".");
            System.out.println("Untreated patients: "+untreatedpatients+".");
        }
    }


