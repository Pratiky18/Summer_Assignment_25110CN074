//program to print character pyramid
import java.util.Scanner;

public class ques40 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = input.nextInt();

        for(int i=1;i<=rows;i++)
        {
            for(int space = rows;space>i;space--)
            {
                System.out.print(" ");
            }
            char ch ='A';
            for(int j=1;j<=i;j++)
            {   
                System.out.print(ch);
                ch++;
            }
            for(int j=i-1;j>0;j--)
            {   
                int value = j+64;
                char character = (char)(value);
                System.out.print(character);
            }
            System.out.println();
        }
    }
}
