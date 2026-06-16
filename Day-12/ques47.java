// method/function for Nth fibonacci term
import java.util.Scanner;

public class ques47 {
    
    public int fibonacci(int term)
    {   
        if(term<0)
        {
            return -1;
        }
        int a=0;
        int b=1;

        if(term==0) return a;

        for(int i=2;i<=term;i++)
        {
            int temp=b;
            b+=a;
            a=temp;
        }
        return b;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a term to check: ");
        int num = input.nextInt();

        ques47 fibo = new ques47();
        int result = fibo.fibonacci(num);
        if(result !=  -1)
        System.out.print(result);
        else
        System.out.println("Invalid Input");
    }
}
