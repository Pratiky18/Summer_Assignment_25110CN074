//LCM of two numbers
import java.util.Scanner;

public class ques12 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter two numbers: ");
        int  num1 = input.nextInt();
        int num2 = input.nextInt();
        int lcm = 1;
        int gcd = 1;
        int min;
        if(num1<1 || num2<1)
        {
            System.out.print("LCM is only defined for positive integers");
        }
        else{

            if(num1<num2)
            {
                min = num1;
            }
            else{
                min = num2;
            }
            for(int i = 1 ;i<=min;i++)
            {
                if(num1%i==0 && num2%i==0)
                {
                    gcd = i;
                }
            }
            lcm = (num1*num2)/gcd;
            System.out.print("The LCM of given numbers is " + lcm);
        }
    }
}
