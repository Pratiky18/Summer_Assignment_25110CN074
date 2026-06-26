//program to find largest prime factor of a number
import java.util.Scanner;

public class ques20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        int max_factor=-1;
        while(num%2==0)
        {
            max_factor = 2;
            num /= 2;
        }

        for(int i =3 ;i<=Math.sqrt(num);i+=2)
        {
            while(num%i==0)
            {
                max_factor=i;
                num /= i;
            }
        }

        if(num>2)
        {   
            max_factor = num;
        }

         System.out.print("The largest prime factor is "+max_factor);
    }
}
