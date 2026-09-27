import java.util.Scanner;

public class Exercise3 {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter number a = ");
        int FirstNum = input.nextInt();
        System.out.print("Please enter number b = ");
        int SecondNum = input.nextInt();

        int Add;
        Add = FirstNum + SecondNum;

        System.out.println(Add);

    }
}
