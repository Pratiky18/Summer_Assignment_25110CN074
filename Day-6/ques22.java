//binary to decimal conversion

import java.util.Scanner;

public class ques22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a binary number: ");
        String binaryString = scanner.nextLine();

        int decimal = 0;
        int power = 0;

        for (int i = binaryString.length() - 1; i >= 0; i--) {
            
            char bit = binaryString.charAt(i);
            
            if (bit == '1') {
                decimal += Math.pow(2, power);
            }
    
            power++;
        }

        System.out.println("Decimal representation: " + decimal);
        
    }
}
