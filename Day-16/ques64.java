//program to remove duplicates from an array

public class ques64 {
    public static void main(String[] args) {
        int[] arr = {5, 1, 2, 5, 2, 3, 4, 4, 1};
        
        System.out.println("Original array: " + Arrays.toString(arr));
        
        Arrays.sort(arr);
        
        int[] temp = new int[arr.length];
        int j = 0;
    
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                temp[j] = arr[i];
                j++;
            }
        }
        
        temp[j++] = arr[arr.length - 1];
        
        System.out.print("Array after removing duplicates: ");
        for (int i = 0; i < j; i++) {
            System.out.print(temp[i] + " ");
        }
        System.out.println();
    }
}
