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
