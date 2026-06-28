//program for intersection of arrays

public class ques67 {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 4, 5, 6};
        int[] arr2 = {2, 3, 5, 7};
        
        System.out.print("Intersection of arrays: ");
        
        for (int i = 0; i < arr1.length; i++) {

            for (int j = 0; j < arr2.length; j++) {
                
        
                if (arr1[i] == arr2[j]) {
                    System.out.print(arr1[i] + " ");
                    break;
                }
            }
        }
        System.out.println();
    }
}
