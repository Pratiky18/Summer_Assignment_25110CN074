//program to print star pyramid
import java.util.Scanner;

public class ques37 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = input.nextInt();

        for(int i=1;i<=rows;i++)
        {   
            for(int space=rows;space>i;space--)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=2*i-1;j++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    
}
