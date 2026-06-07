// factorial of a number
import java.util.Scanner;

public class ques3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = input.nextInt();
        int num2 = num;
        int fact = 1;
        while(num!=0)
        {
            fact = fact*num;
            num--;
           
        }
         System.out.println("Factorial of " + num2 + " is " + fact);
    }
    
}
