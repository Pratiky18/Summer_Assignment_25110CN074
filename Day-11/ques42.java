//program to find maximum using method/function
import java.util.Scanner;

public class ques42 {
    
    public int maximum(int a, int b)
    {
        int max;
        if(a>b)
        {
            max=a;
        }
        else{
            max=b;
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();

        ques42 max = new ques42();
        int result = max.maximum(num1,num2);

        System.out.println("Maximum of the two numbers is: "+result);
    }
}
