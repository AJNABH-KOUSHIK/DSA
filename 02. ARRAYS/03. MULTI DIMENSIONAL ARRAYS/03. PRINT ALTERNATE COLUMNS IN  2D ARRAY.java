// "Write a Java program that takes an integer n as input, followed by the elements of an n x n matrix.
//  The program should then print the alternate columns of the matrix, starting from the first column."
import java.util.Scanner;
public class AlternateColumns {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the square matrix (n): ");
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        System.out.println("Enter the " + (n * n) + " elements of the matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("\nPrinting alternate columns of the matrix:");
        for (int j = 0; j < n; j += 2) {
            for (int i = 0; i < n; i++) {
                System.out.println(arr[i][j]);
            }
        }
    }
}
// INPUT : 3
// ENTER THE 9 ELEMENTS OF THE MATRIX : 1 2 3 4 6 7 8 9
// OUTPUT : 1 4 7 3 8 9
