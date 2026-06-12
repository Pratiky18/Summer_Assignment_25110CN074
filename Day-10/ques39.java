//program to print number pyramid
import java.util.Scanner;

public class ques39 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Eneter number of rows: ");
        int rows = input.nextInt();

        for(int i=1;i<=rows;i++)
        {
            for(int space=rows;space>i;space--)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print(j);
            }
            for(int j=i-1;j>0;j--)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
