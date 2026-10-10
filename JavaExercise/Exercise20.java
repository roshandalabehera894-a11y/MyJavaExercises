import java.util.Scanner;
public class Exercise20 {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a nth number: ");
        int nthNum = input.nextInt();

        int factorial = 1;

        while (nthNum > 1){
            factorial = factorial*nthNum;
            nthNum -= 1;
        }
        System.out.println("Factorial of this number is = "+factorial);
    }
}
