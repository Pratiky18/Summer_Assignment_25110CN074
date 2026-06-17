//program to find largest and smallest element from an array
import java.util.Scanner;

public class ques51 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = input.nextInt();
        int[] array = new int[size];

        for(int i=0;i<size;i++)
        {
            System.out.print("The element at index "+i+" is: ");
            array[i] = input.nextInt();
        }

        int min=array[0];
        for(int i=1;i<size;i++)
        {
            if(min>array[i])
                min = array[i];
        }
        System.out.println("The smallest element is: "+min);

        int max = array[0];
        for(int i = 1;i<size;i++)
        {
            if(max<array[i])
            {
                max = array[i];
            }
        }
        System.out.println("The largest element is: "+max);
    }
}
