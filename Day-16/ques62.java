package Day-16;

public class MaxFrequencyBasic {
    public static void main(String[] args) {
  
        int[] arr = {2, 3, 2, 5, 2, 6, 3, 3, 3, 2, 2};
        
        int maxFreq = 0;
        int maxFreqElement = arr[0];
        
        for (int i = 0; i < arr.length; i++) {
            int currentCount = 0;
            
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    currentCount++;
                }
            }
            
            if (currentCount > maxFreq) {
                maxFreq = currentCount;
                maxFreqElement = arr[i];
            }
        }
        
        System.out.println("Maximum frequency element is: " + maxFreqElement);
        System.out.println("It appears " + maxFreq + " times.");
    }
}