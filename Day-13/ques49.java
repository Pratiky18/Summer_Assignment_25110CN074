//input and print an array
import java.util.Scanner;

public class ques49 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = input.nextInt();
        int[] array = new int[size];

        for(int i=0; i<size;i++)
        {
            System.out.print("The element at index " +i+" is: ");
            array[i] = input.nextInt();
        }
        
        for(int num : array)
        {
            System.out.print(num + " ");
        }
     
    }
}

