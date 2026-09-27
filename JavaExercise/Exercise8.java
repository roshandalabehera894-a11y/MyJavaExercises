import java.util.Scanner;
public class Exercise8 {
    public static void  main(String [] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the height of r-Triangle = ");
        float height = input.nextFloat();
        System.out.print("Enter the base of r-Triangle = ");
        float base = input.nextFloat();

        // If two floating number get multiply then their product will
        //     be a double number.

        double Area = 0.5*height*base;
        System.out.print("Area of the R-Triangle = " + Area);

    }
}
