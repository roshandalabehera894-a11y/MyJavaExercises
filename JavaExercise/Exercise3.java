Q) Create a program to prompt the user for two numbers (a and b), add them together, and display the result.

sol:-    
import java.util.Scanner;

public class Exercise3 {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter number a = ");
        int FirstNum = input.nextInt();
        System.out.print("Please enter number b = ");
        int SecondNum = input.nextInt();

        int Add;
        Add = FirstNum + SecondNum;

        System.out.println(Add);

    }
}
