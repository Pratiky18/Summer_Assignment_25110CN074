//program to check armstrong number
import java.util.Scanner;

public class ques15 {
    public static void main(String[]args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = input.nextInt();
        int count=0;
        int remain;
        int temp=num;   
        while(temp!=0)
        {
            temp /=10;
            count++;
        }

        double sum=0;
        temp = num;

        while(temp!=0)
        {
            remain = temp%10;
            temp /=10;
            sum = sum + Math.pow(remain,count);
        }
        if(sum==num)
        {
            System.out.print(num+ " is an armstrong number");
        }
        else{
            System.out.print(num+ " is not an armstrong number");
        }

    }
}
