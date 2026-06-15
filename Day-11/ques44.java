//program to print factorial of a number using method/funtion 
import java.util.Scanner;

public class ques44 {
    
    public int factorial(int a)
    {
        int fact = 1;
        while(a!=0)
        {
            fact=fact*a;
            a--;
        }
        return fact;
    }
    
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num  = input.nextInt();

        ques44 fact = new ques44();
        int result = fact.factorial(num);
        System.out.println("The factorial of "+num+" is "+result);
    }
}
