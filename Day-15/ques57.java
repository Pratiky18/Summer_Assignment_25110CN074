//program to reverse an array
import java.util.Scanner;

public class ques57 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = input.nextInt();
        int[] array = new int[size];

        System.out.println("Enter the elements of the array:");  
        for(int i=0;i<size;i++)
        {
            array[i] = input.nextInt();
        }

        int start = 0;
        int end = size-1;
        while(start<end)
        {
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }

        System.out.print("The reversed array is: ");
        for(int element : array)
        {
            System.out.print(element+" ");
        }
    }
}
