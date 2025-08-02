// "Write a Java program that takes an integer n as input, followed by the elements of an n x n matrix. 
// The program should then print the alternate rows of the matrix, starting from the first row."
import java.util.Arrays;
import java.util.Scanner; 
public class AlternateRows {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the square matrix (n): ");
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        System.out.println("Enter the " + (n*n) + " elements of the matrix:");
        for (int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("\nPrinting alternate rows of the matrix:");
        for (int i = 0; i < n; i += 2) {
            System.out.println(Arrays.toString(arr[i]));
        }
    }
}
// INPUT : 3
// ENTER THE 9 ELEMNETS OF THE MATRIX : 
// 1 2 3 4 5 6 7 8 9
// OUTPUT : [ 1 2 3 ]
//        : [ 7 8 9 ]
