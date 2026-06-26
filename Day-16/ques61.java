//find missing number from an array

public class ques61 {
    public static void main(String[] args) {
        
        // An array of numbers from 1 to 6, but '3' is missing
        int[] arr = {1, 2, 4, 5, 6}; 
        int n = arr.length + 1; 

        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;
        
        for (int i = 0; i < arr.length; i++) {
            actualSum += arr[i];
        }
        
        int missingNumber = expectedSum - actualSum;
        
        System.out.println("The missing number is: " + missingNumber);
    }
}