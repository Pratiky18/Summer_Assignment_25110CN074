//program to print armstrong number in a given range
import java.util.Scanner;

public class ques16 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter your range: ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
    
        if(num1>num2)
        {
            System.out.print("First number should be smaller than second");
        }

        else if(num1<0 && num2<0)
        {
            System.out.print("Enter a valid range");
        }

        else
        {
            if(num1<0)
            {
                num1=0;
            }

            for(int i=num1;i<=num2;i++)
            {  
                int count=0;
                double sum=0;
               int temp = i;
               while(temp!=0)
                {  
                   count++;
                   temp/=10; 
                } 

             temp = i;
               while(temp!=0)
               { 
                 int remain = temp%10;
                 temp/=10;
                 sum = sum + Math.pow(remain,count);
               }

               if(sum==i)
               {
                System.out.print(i+ " ");
               }
               count = 0;
            }
        }
    }
}
