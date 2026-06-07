// multiplication table of a given number
import java.util.Scanner;

public class ques2{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = input.nextInt();
        int count = 1;
        while(count!=11)
        {
            int product = num*count;
            System.out.println(num + " * " + count + " = " + product);
            count++;
        }
    }
}
    

