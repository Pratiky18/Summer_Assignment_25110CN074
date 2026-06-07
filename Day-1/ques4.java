// a program to count digits of a number
import java.util.Scanner;

public class ques4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = input.nextInt();
        int count = 0;
        int num2 = num; // num2 used for the print statement
        while(num!=0)
        {
            num = num/10;
            count++;
        }
        System.out.println("Number of digits in " + num2 + " is " + count);
    }
    
}
