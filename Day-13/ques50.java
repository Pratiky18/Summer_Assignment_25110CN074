//program to find sum an average of an array
import java.util.Scanner;

public class ques50 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = input.nextInt();
        int[] array = new int[size];
        int sum=0;
        float avg;
        for(int i = 0; i<size;i++)
        {
            System.out.print("The element at index "+i+" is: ");
            array[i] = input.nextInt();
            sum+=array[i];
        }
        System.out.println("The sum of elements of the array is: "+sum);
        avg = (float)(sum)/size;
        System.out.println("The average is: "+avg);
    }
}
