//program to print prime numbers in a given range
import java.util.Scanner;

public class ques10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the range of number: ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int count=0;
        if(num2<=num1)
        {
            System.out.print("2nd number should be greater than first");
        }
        else
        {
            if(num1<2 && num2 < 2)
            {
                System.out.print("No prime number in this range");
            }
            else
            {
                if(num1<2)
                {
                    num1 = 2;
                }

                for(int i=num1;i<=num2;i++)
                { 

                    for(int j=1;j<=i;j++)
                    {
                        if(i%j==0)
                            count++;
                    }
                    if(count<=2)
                    {
                        System.out.print(i + " ");
                    }
                    count = 0;
                }
            }
        } 
        
    
    }
}
