import java.util.Scanner;

public class Exercise18 {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number for multiplication table: ");
        int num = input.nextInt();

        int x = 1;

        while(x>0 && x <= 10){
            int multiTable = num*(x);
            System.out.println(num+"*"+x+"="+multiTable);
            x +=1;
        }
    }
}
