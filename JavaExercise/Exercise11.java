Q) Write a Java program to convert temperature from Fahrenheit (°F) to Celsius (°C), taking the temperature in Fahrenheit as user input.

Sol:-
import java.util.Scanner;
public class Exercise11 {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Temperature(in ℉) : ");
        float F = input.nextFloat();

        double C = ((F - 32)*5)/9;

        System.out.print("Temperature(in ℃) is : " + C + "℃");
    }
}
