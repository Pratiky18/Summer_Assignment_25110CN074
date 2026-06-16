// check for perfect number using method/function
import java.util.Scanner;

public class ques48 {
 
    public static boolean perfect(int a)
    {   
        if(a<1) return false;

        int temp = a;
        int sum=0;
        for(int i=1;i<a;i++)
        {
            if(temp%i==0)
            {
                sum+=i;
            }
        }
        return sum==a;
    }

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();

        boolean result = perfect(num);
    
        if(result)
            System.out.println(num+ " is a perfect number");
        else
            System.out.print(num + " is not a perfect number");
    }
}
