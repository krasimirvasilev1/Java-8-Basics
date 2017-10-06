import java.util.Scanner;

/**
 * Created by Krasi on 4/5/2017.
 */
public class EqualPairs {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        Integer n = Integer.parseInt(console.nextLine());
        int sum = 0;
        int sum1 = 0;
        int sum2 = 0;
        Integer minsum = Integer.MAX_VALUE;
        Integer maxsum = Integer.MIN_VALUE;
            for (int i=1;i<=n;i++){
                Integer num = Integer.parseInt(console.nextLine());
                Integer num1 = Integer.parseInt(console.nextLine());
                sum = sum + num;
                sum = sum + num1;
                sum1 = sum;
                if (sum1<minsum){
                    minsum=sum1;}
                    sum2 = sum;
                    if (sum2>maxsum){
                    maxsum=sum2;}
                sum = (sum - (num+num1));
            }
            if (maxsum-minsum == 0){
                System.out.println("Yes,value="+maxsum);}
                else{
                minsum = Math.abs(minsum);
                System.out.println("No,maxdiff="+(maxsum-minsum));}
            }

        }


