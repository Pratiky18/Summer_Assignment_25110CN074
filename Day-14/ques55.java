//program to find second largest element
import java.util.Scanner;

public class ques55 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = input.nextInt();
        int[] array = new int[size];

        System.out.print("Enter the elements: ");
        for(int i = 0;i<size;i++)
        {
            array[i] = input.nextInt();
        }

        int max = array[0];
        for(int i = 1;i<size;i++)
        {
            if(array[i]>max)
            {
                max = array[i];
            }
        }

        int second_max = array[0];
        if(second_max==max)
        {
            second_max = array[1];
        }
        for(int i = 1;i<size;i++)
        {
            if(array[i]>second_max && array[i]<max)
            {
                second_max = array[i];
            }
        }
        System.out.print("The second largest element is: "+second_max);
   }
}
