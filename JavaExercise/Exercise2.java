Q) Write a Java program that asks the user to enter their name and then displays a welcome message in the format:
    Welcome <name> to FirstPrgram .
Sol:-       
import java.util.Scanner;
public class Exercise2 {
    public static void main(String [] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter your name: ");
        String name = input.nextLine();

        System.out.println("Welcome " + name + " to FirstProgram");

    }
}
