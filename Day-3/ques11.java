// GCD of two numbers
import java.util.Scanner;

public class ques11 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter two numbers: ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int min;
        int gcd=1;
        if(num1==0 || num2 ==0)
        {
            System.out.print("Inputs cannot be zero");
        }
        else{
        if(num1<num2)
        {
            min = num1;
        }
        else
        {
            min = num2;
        }

        if(min<0)
        {
            min = min*(-1);
        }

        for(int i=1;i<=min;i++)
        {
            if(num1%i==0 && num2%i==0)
            {
              gcd = i;
            }
        }
        System.out.print("GCD of the given numbers is " + gcd);
       }
    }
}
