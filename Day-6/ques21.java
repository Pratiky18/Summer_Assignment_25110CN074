//decimal to binary conversion

import java.util.Scanner;

public class ques21{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int decimal = scanner.nextInt();
        
        if (decimal == 0) {
            System.out.println("Binary representation: 0");
            return;
        }

        int[] binaryNum = new int[32]; 
        int i = 0;

        while (decimal > 0) {
            binaryNum[i] = decimal % 2; 
            decimal = decimal / 2;      
            i++;
        }

        System.out.print("Binary representation: ");
        for (int j = i - 1; j >= 0; j--) {
            System.out.print(binaryNum[j]);
        }
        System.out.println();
        
    }
}