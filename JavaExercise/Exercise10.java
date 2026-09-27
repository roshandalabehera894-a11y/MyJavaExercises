import java.util.Scanner;
public class Exercise10 {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the Principle amount : ₹");
        float P = input.nextFloat();
        System.out.print("Enter the Rate of interest : ");
        float R = input.nextFloat();
        System.out.print("Enter the Time : ");
        float T = input.nextFloat();

        double CompoundInterest = P*(1 + (R/100))*T;

        System.out.print("Your Compound Interest is : ₹" + CompoundInterest);
        System.out.print("Your Total amount is : ₹" + CompoundInterest+P);

    }
}
