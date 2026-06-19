//program to move zeros to end of an array
import java.util.Scanner;

public class ques60 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size if the array: ");
        int size = input.nextInt();
        int[] array = new int[size];

        System.out.println("Enter the elements of the array: ");
        for(int i=0;i<size;i++)
        {
            array[i] = input.nextInt();
        }

        int checker = 0;
        for(int i = 0;i<size;i++)
        {
            if(array[i]!=0)
            {
                array[checker] = array[i];
                checker++;
            }
        }
        
        while(checker<size)
        {
            array[checker] = 0;
            checker++;
        }
        
        System.out.print("The array after shifting zeroes is: ");
        for(int element : array)
        {
            System.out.print(element + " ");
        }
    }
}
