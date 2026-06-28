// program for union of arrays

public class ques66 {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 4, 5, 7};
        int[] arr2 = {2, 3, 5, 6};
        
        System.out.print("Union of arrays: ");

        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }
        

        for (int i = 0; i < arr2.length; i++) {
            boolean isDuplicate = false;
            

            for (int j = 0; j < arr1.length; j++) {
                if (arr2[i] == arr1[j]) {
                    isDuplicate = true; 
                    break;
                }
            }
            
        
            if (!isDuplicate) {
                System.out.print(arr2[i] + " ");
            }
        }
        System.out.println();
    }
}
