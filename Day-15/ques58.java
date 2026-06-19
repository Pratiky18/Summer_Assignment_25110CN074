//program to rotate an array left
import java.util.Scanner;

public class ques58 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = input.nextInt();
        int[] array = new int[size];

        System.out.println("Enter the elements of the array: ");
        for(int i=0;i<size;i++)
        {
            array[i] = input.nextInt();
        }

        int temp = array[0];
        for(int i=0;i<size-1;i++)
        {
            array[i] = array[i+1];
        }
        array[size-1]=temp;

        System.out.print("The shifted array is: ");
        for(int element : array)
        {
            System.out.print(element+ " ");
        }
    }    
}
