import java.util.Scanner;
public class Exercise14 {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number a = ");
        int a = input.nextInt();

        System.out.print("Enter a number b = ");
        int b = input.nextInt();

        System.out.print("Enter a number c = ");
        int c = input.nextInt();

        if (a > b && a > c){
            System.out.println("a is the greatest number.");
        }else if (b > a && b>c) {
            System.out.println("b is the greatest number.");
        }else{
            System.out.println("c is the greatest number.");
        }
    }
}
