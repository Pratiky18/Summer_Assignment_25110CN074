//program to find pair with a given sum

public class ques63 {
    public static void main(String[] args) {
        int[] arr = {2, 7, 11, 15, 3, 6, 8, 1};
        int targetSum = 9;
        boolean found = false;

        System.out.println("Pairs with target sum of " + targetSum + ":");
        
        for (int i = 0; i < arr.length; i++) {
            
            for (int j = i + 1; j < arr.length; j++) {
                
              
                if (arr[i] + arr[j] == targetSum) {
                    System.out.println("(" + arr[i] + ", " + arr[j] + ")");
                    found = true;
                }
            }
        }
        
        if (!found) {
            System.out.println("No pairs found matching the sum.");
        }
    }
}