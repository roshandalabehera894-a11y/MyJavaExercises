import java.util.Scanner;

public class Exercise17 {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = input.nextInt();

        System.out.print("Enter Second number: ");
        int b = input.nextInt();


        int binaryAddition = a | b;
        int binaryMultiplication = a & b;
        int Not = ~b;

        System.out.println("Result is: " + binaryAddition);
        System.out.println("Result is: " + binaryMultiplication);
        System.out.println("Result is: " + Not);
    }
}
