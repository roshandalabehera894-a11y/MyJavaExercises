Q) "Write a Java program to take two floating-point (decimal) numbers as input from the user, calculate their product
    (multiplication), and display the result.

Sol:-   
import java.util.Scanner;
public class Exercise6 {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a = ");
        float a = input.nextFloat();
        System.out.print("Enter b = ");
        float b = input.nextFloat();

        System.out.println("Product of a and b = " + a*b);


    }
}
