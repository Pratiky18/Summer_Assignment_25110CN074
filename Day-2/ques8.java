// program to check whether a number is palindrome or not
import java.util.Scanner;

public class ques8 {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = input.nextInt();
        int rev =0;
        int remain;
        int num2 = num;
        while(num!=0)
        {
            remain = num%10;
            rev = rev*10 + remain;
            num /=10;
        }
        if(num2 == rev)
        {
            System.out.println("The given number is a palindrome");
        }
        else
        {
            System.out.println("The given number is not a palindrome");
        }
        
    }
}
