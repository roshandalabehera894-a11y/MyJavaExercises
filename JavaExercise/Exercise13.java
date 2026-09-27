import java.util.Scanner;
public class Exercise13 {
    public static void main(String [] args){
        Scanner input =  new Scanner(System.in);

        System.out.print("Enter an Integer number: ");
        int num = input.nextInt();

        if (num/2 == 0){
            System.out.println("This is an even number.");
        }else{
            System.out.println("This is an odd number.");
        }
    }
}
