Q) Write a Java program to calculate and display the perimeter of a rectangle, taking its length and width as input from the user.

Sol:-
import java.util.Scanner;
public class Exercise7 {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the length of rectangle = ");
        float length = input.nextFloat();
        System.out.print("Enter the width of rectangle = ");
        float width = input.nextFloat();

        float perimeter = 2*(length+width);
        System.out.print("Perimeter of Rectangle = " + perimeter);

    }
}
