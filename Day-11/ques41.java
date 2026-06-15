//sum of two numbers using method/function
import java.util.Scanner;

public class ques41 {
    
    public int addnumbers(int a, int b)
    {
        int sum = a+b;
        return sum;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your numbers: ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        
        ques41 add = new ques41();
        int  result = add.addnumbers(num1,num2);
        System.out.println("Sum of two numbers is: "+result);
    }
}
