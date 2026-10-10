import java.util.Scanner;
public class Exercise19 {
    public static void main(String [] args){
        Scanner sumOfOdd = new Scanner(System.in);

        System.out.print("Enter a nth odd number:");
        int nOdd = sumOfOdd.nextInt();
        int i = 1;
        int sum = 0;

        while (i <= nOdd){
            sum = sum + i;
            i = i - 1;
        }
        System.out.println("Sum of first"+nOdd+"odd number = "+sum);
    }
}
