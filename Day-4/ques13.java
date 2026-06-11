// program to generate fibonacci series
import java.util.Scanner;

public class ques13 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the term upto which you want to print fibonacci: ");
        int term = input.nextInt();
        int a=0;
        int b=1;
        
        System.out.print("0 ");
        System.out.print("1 ");
       
         for(int i=2;i<=term;i++)
         {
           int temp = b;
           b = b+a;
           a = temp;
           System.out.print(b+" ");
        }
        
    }
    
}
