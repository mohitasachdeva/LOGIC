package Logic;
import java.util.Scanner;
public class NewtonMethod {

        static void sqrt(int c){
            double t=c;
            double epsilon = 1E-15;
            while(Math.abs(t-c/t) > epsilon*t)
                t=(c/t+t)/2;
            System.out.println(t);

        }

        public static void main(String[] args) {
            Scanner scr = new Scanner(System.in);
            System.out.println("Enter the number to compute sqrt");
            int no = scr.nextInt();
            sqrt(no);
        }
    }

