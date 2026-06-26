//program to check for strong number
import java.util.Scanner;

public class ques18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        int last_digit;
        int temp=num;
        int sum=0;

        while(temp!=0)
        {
            last_digit = temp%10;
            int fact=1;
            for(int i=1;i<=last_digit;i++)
            {
                fact *= i;
            }
            sum +=fact;
            temp = temp/10;
        }

        if(sum==num)
        {
            System.out.print(num+ " is a strong number");
        }
        else{
            System.out.print(num+ " is not a strong number");
        }
    }
    
}
