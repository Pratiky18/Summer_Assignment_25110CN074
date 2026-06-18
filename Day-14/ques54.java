//program to find frequency of an element
import java.util.Scanner;

public class ques54 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of thhe array: ");
        int size = input.nextInt();
        int[] array = new int[size];

        for(int i = 0; i<size;i++)
        {
            System.out.print("The element at index "+i+" is: ");
            array[i] = input.nextInt();
        }

        System.out.print("Enter an element to find its frequency: ");
        int element = input.nextInt();
        int count = 0;

        for(int i=0;i<size;i++)
            {
                if(array[i]==element)
                {
                    count++;
                }
            }
        System.out.print("The frequency of "+element+" is "+count);
    }
}
