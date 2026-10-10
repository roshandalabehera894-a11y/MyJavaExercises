import java.util.Scanner;

import static java.lang.Long.sum;

public class Exercise21 {
    static int sum = 0;

    public static void main(String[] args) {
        int[] arr = {2,3,5,8};

        int i = 0;
        int sum1 = sUm(arr, i);
        double aVg = avg( arr, i);

        System.out.println("Sum of all elements in array = "+ sum1);
        System.out.print("Average of all elements in array = "+ aVg);
    }
    public static int sUm(int[] arr, int i) {

        while (i < arr.length){
            sum += arr[i];
            i++;
        }
        return sum;
    }

    public static double avg(int[] arr, int i) {
        double avg;
        avg = (sum)*1.0/arr.length;

        return avg;
    }
}
