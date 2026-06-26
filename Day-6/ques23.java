//program to count set bits in a number

import java.util.Scanner;

public class ques23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive number: ");
        int number = scanner.nextInt();
        
        int count = 0;
        
        while (number > 0) {
         
            if (number % 2 == 1) {
                count++;
            }
            
            number = number / 2; 
        }

        System.out.println("Number of 1s: " + count);

    }
}