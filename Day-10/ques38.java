//program to print reverse star pyramid
import java.util.Scanner;

public class ques38 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = input.nextInt();

        for(int i=rows;i>0;i--)
        {
            for(int space=rows;space>i;space--)
            {
                System.out.print(" ");
            }
            for(int j=2*i-1;j>0;j--)
            {
                System.out.print("*");
            }
            System.out.println("");
        }

    }    
}
