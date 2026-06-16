// check a number for armstrong using method/function
import java.util.Scanner;

public class ques46 {
    
    public static boolean armstrong(int a)
    {   
        if(a<0)
        { return false; }

        int temp=a;
        int count = 0;
        double sum=0;
        int remain;
        while(temp!=0)
        {
            temp/=10;
            count++;
        }
        temp = a;
        while(temp!=0)
        {
            remain = temp%10;
            sum = sum + Math.pow(remain,count);
            temp/=10;

        }
        return sum==a;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = input.nextInt();
        boolean result = armstrong(num);
        if(result)
        { System.out.println(num+ " is an armstrong number"); }
        else
        { System.out.print(num + " is not an armstrong number"); }
    }
}
