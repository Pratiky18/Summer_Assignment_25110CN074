// checking a number for palindrome using method/function
import java.util.Scanner;

public class ques45 {
    
    public static boolean palindrome(int a)
    {   
        if(a<0)
        {
            return false;
        }

        int temp=a;
        int rev=0;
        int remain;

        while(temp!=0)
        {
           remain=temp%10;
           temp/=10;
           rev=rev*10+remain;
        }
       return rev==a;
    }

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();

        boolean result = palindrome(num);

        if(result)
        {
            System.out.println(num+ " is a palindrome");
        }
        else
        {
            System.out.print(num+ " is not a palindrome");
        }
    }

}
