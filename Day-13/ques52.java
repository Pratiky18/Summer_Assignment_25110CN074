//program to count even and odd elements of an array
import java.util.Scanner;

public class ques52 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = input.nextInt();
        int[] array = new int[size];

        for(int i=0;i<size;i++){
            System.out.print("The element at index "+i+" is: ");
            array[i] = input.nextInt();
        }

        int even_count =0;
        int odd_count=0;
        for(int i=0;i<size;i++)
        {
            if(array[i]%2==0)
            {
                even_count++;
            }
            else
            {
                odd_count++;
            }
        }
        System.out.println("There are " +even_count+ " even elements in the array");
        System.out.print("There are " +odd_count+ " odd elements in the array");
    }
}