// program to reverse a number
import java.util.Scanner;

public class ques6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = input.nextInt();
        int rev =0;
        int remain;
        while(num!=0)
        {
            remain = num%10;
            rev = rev*10 + remain;
            num /=10;
        }
        System.out.print("The reverse of the given number is "+rev);
    }
}
