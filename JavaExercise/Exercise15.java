Q) Write a Java program to check whether a given year is a Leap Year or not.

Sol:-
import java.util.Scanner;
public class Exercise15 {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a year : ");
        int year = input.nextInt();

        System.out.print("Enter a TOTAL DAYS IN THAT YEAR : ");
        int totalNumDay = input.nextInt();

        if (totalNumDay%365 == 0){
            System.out.print("This is not a Leap year.");
        }else {
            System.out.print("This is a Leap year.");

        }
    }
}
