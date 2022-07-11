package Logic;
import java.util.Scanner;
public class MonthlyPayment {


        static void Payment(){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter principle amount");
            double principle = sc.nextDouble();
            System.out.println("Enter term of loan (in years)");
            double noofyears = sc.nextDouble();
            System.out.println("Enter interest rate");
            double rate = sc.nextDouble();
            double n = 12 * noofyears;
            double r = rate/(12*100);
            double MonPayment = (principle*r)/(1-Math.pow((1+r),(-n)));
            System.out.println("Payment is: "+ MonPayment);
        }

        public static void main(String[] args) {
            Payment();
        }
    }

