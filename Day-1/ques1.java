// program to calculate sum of first N natural numbers
import java.util.Scanner;

public class ques1{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();

        int count = 1;
        int sum = 0;

        while(count!=num+1)
        {
             sum = sum + count;
            count++;
        }
        System.out.println("Sum of all the natural numbers upto " + num + " is "  + sum);
    }
}