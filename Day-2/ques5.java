
// sum of digits of a number
import java.util.Scanner;

public class ques5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = input.nextInt();
        int sum = 0;
        int remain;
        int num2 = num; 
        while(num != 0)
        {
            remain = num %10;
            sum = sum+remain;
            num /= 10;
        }
         System.out.println("The sum of the digits of " + num2 + " is " + sum);
    }
}
