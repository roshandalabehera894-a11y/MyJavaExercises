import java.util.Scanner;

public class Exercise12 {
    public static void main(String [] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a Integer number: ");
        int num = input.nextInt();

        if (num > 0){
            System.out.println("This number is a positive number.");
        }else if (num == 0){
            System.out.println("This number is zero.");
        }else {
            System.out.println("This number is a negative number.");
        }
    }
}
