//program to rotate an array right
import java.lang.classfile.TypeAnnotation.SupertypeTarget;
import java.util.Scanner;

public class ques59 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the aize of the array: ");
        int size = input.nextInt();
        int[] array = new int[size];

        System.out.println("Enter the elements of the array: ");
        for(int i=0;i<size;i++)
        {
            array[i] = input.nextInt();
        }

        int temp = array[size-1];
        for(int i=size-1;i>0;i--)
        {
            array[i] = array[i-1];
        }
        array[0] =temp;

        System.out.print("The shifted array is: ");
        for(int element : array)
        {
            System.out.print(element + " ");
        }
    }
}
