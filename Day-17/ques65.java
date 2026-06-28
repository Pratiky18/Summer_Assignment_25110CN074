//program to merge two arrays

public class ques65 {
    public static void main(String[] args) {
        int[] arr1 = {10, 20, 30};
        int[] arr2 = {40, 50, 60, 70};
        int[] mergedArray = new int[arr1.length + arr2.length];
        int index = 0; 
   
        for (int i = 0; i < arr1.length; i++) {
            mergedArray[index] = arr1[i];
            index++;
        }
        

        for (int i = 0; i < arr2.length; i++) {
            mergedArray[index] = arr2[i];
            index++;
        }
      
        System.out.print("Merged Array: ");
        for (int i = 0; i < mergedArray.length; i++) {
            System.out.print(mergedArray[i] + " ");
        }
        System.out.println();
    }
}