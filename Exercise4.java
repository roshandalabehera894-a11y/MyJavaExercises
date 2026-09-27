// Q. Create a program and swap two numbers.
 import java.util.Scanner;

public class Exercise4 {
    static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter a number a = ");
        int a = input.nextInt();

        System.out.print("Please enter a number b = ");
        int b = input.nextInt();

        int c;

        c = a;
        a = b;
        b = c;

        System.out.println(a);
        System.out.println(b);

    }

}
