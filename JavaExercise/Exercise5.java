Q) Write a Java program that takes two integers as input from the user and prints the
   results of all basic arithmetic operations: addition ($+$), subtraction ($-$), multiplication ($*$),
   division ($/$), and remainder/modulo ($%$).

Sol:-    
import java.util.Scanner;
public class Exercise5 {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);


        int a = input.nextInt();
        int b = input.nextInt();

        System.out.println("a+b = "+ a+b);
        System.out.println(a-b);
        System.out.println("a*b = "+ a*b);
        System.out.println("a/b = "+ a/b);
        System.out.println("a%b = "+ a%b);



    }
}
