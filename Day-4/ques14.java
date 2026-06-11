//program to print nth fibonacci term
import java.util.Scanner;

public class ques14 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a term: ");
        int term = input.nextInt();
        int a=0;
        int b=1;

        if(term==0)
        {
            System.out.print("0 ");
        }
        else if(term==1)
        {
            System.out.print("1 ");
        }
        else
        {
            for(int i=2;i<=term;i++)
            {
                int temp = b;
                b = b+a;
                a = temp;
            }
            System.out.print(b);
        }
    }
}
