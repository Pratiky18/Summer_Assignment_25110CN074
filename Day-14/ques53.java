//program for linear search
import java.util.Scanner;

public class ques53 {
    public static void main(String[] args) {
        System.out.print("Enter the number of elements: ");
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int[] array = new int[size];

        System.out.print("Enter the elements: ");
        for(int i = 0;i<size;i++)
        {
            array[i] = input.nextInt();
        }

        System.out.print("Enter the element you want to search: ");
        int key = input.nextInt();
        int location = -1;

        for(int i =0;i<size;i++)
        {
            if(array[i]==key)
            {
                System.out.println(key+" is at index "+i);
                location = i;
                break;
            }

        }
        if(location==-1)
        {
            System.out.println(key+ " not found");
        }
       
    }
}
