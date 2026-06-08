// program to find product of digits
import java.util.Scanner;

public class ques7 {
    public static void main(String[] args) {
        java.util.Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = input.nextInt();
        int remain;
        int product = 1;
        int num2 = num;
        while(num!=0)
        {
            remain = num % 10;
            product = product*remain;
            num /= 10;
        }

        System.out.println("The prouct of digits of " + num2 + " is " + product);
    }
}
