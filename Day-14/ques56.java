//program to find duplicates in array
import java.util.Scanner;

public class ques56 {
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

        for(int i=0;i<size-1;i++)
        {
            for(int j=i+1;j<size;j++)
            {
              if(array[i]==array[j])
                {
                    System.out.println("The elements at index "+i+" and index "+j+" are same");
                }
            }
        }
    }
}
