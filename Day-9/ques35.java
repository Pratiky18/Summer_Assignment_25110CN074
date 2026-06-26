//program to print repeated character pattern

public class ques35 {
    public static void main(String[] args) {
        int rows = 5;
        char ch = 'A'; 
        
        for (int i = 1; i <= rows; i++) {
           
            for (int j = 1; j <= i; j++) {
                System.out.print(ch);
            }
            ch++; 
            System.out.println();
        }
    }
}