import java.util.Scanner;

public class ques24{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter base (x): ");
        double x = scanner.nextDouble();
        System.out.print("Enter exponent (n): ");
        int n = scanner.nextInt();

        double result = 1.0;

        long absN = Math.abs((long) n);

        for (long i = 0; i < absN; i++) {
            result *= x;
        }

        if (n < 0) {
            result = 1.0 / result;
        }

        System.out.println(x + " to the power of " + n + " is: " + result);
        
    }
}