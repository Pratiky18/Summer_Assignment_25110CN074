//program to print factors of a number
import java.util.Scanner;

public class ques19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();

        System.out.print("The factors of "+num+" are: ");
        for(int i=1;i<=num;i++)
        {
            if(num%i==0)
            {
                System.out.print(i+ " ");
            }
        }
    }    
}
