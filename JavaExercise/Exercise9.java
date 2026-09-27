import java.util.Scanner;
public class Exercise9 {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the Principle amount : ₹");
        float P = input.nextFloat();
        System.out.print("Enter the Rate of interest : ");
        float R = input.nextFloat();
        System.out.print("Enter the Time : ");
        float T = input.nextFloat();

        double SimpleInterest = (P*R*T)/100;

        System.out.print("Your Simple Interest is : ₹" + SimpleInterest);
        System.out.print("Your Total amount is  : ₹" + SimpleInterest+P);

    }

}
