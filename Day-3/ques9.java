// program to check for prime number
import java.util.Scanner;

public class ques9 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);


        System.out.print("Enter a number: ");
        int num = input.nextInt();

        if(num<2)
        {System.out.print("The number is not prime");}

        else
     {
        int count = 0;
        for(int i=1;i<=num;i++)
        {
            if(num%i == 0)
            {
                count++ ;
            }
        }
        if(count>2)
        {
            System.out.print("The numbe is not prime");
        }
        else
        {
            System.out.print("The number is prime");
        } 
     }
    }
}
