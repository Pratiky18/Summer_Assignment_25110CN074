//check for prime numbers using method/function
import java.util.Scanner;

public class ques43{

    public static boolean isPrime(int number) {
        
    
        if (number <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
           
            if (number % i == 0) {
                return false; 
            }
        }
    
        return true; 
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number to check: ");
        int num = scanner.nextInt();
    
        boolean result = isPrime(num);

        if (result == true) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is NOT a prime number.");
        }
    
    }
}
