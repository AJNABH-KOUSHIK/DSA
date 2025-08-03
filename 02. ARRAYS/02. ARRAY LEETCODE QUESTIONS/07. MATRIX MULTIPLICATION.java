// Q. Write a Java program to multiply two matrices.
// The program should:
// Accept dimensions of two matrices:
// Matrix A of size m x n
// Matrix B of size n x p
// Accept values for both matrices.
// Multiply the matrices and display the resulting matrix C = A × B of size m x p.
import java.util.Scanner;
public class MatrixMultiplication {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter rows and columns of first matrix:");
        int m = input.nextInt(); // rows of A
        int n = input.nextInt(); // cols of A and rows of B
        System.out.println("Enter columns of second matrix:");
        int p = input.nextInt(); // cols of B
        int[][] A = new int[m][n];
        int[][] B = new int[n][p];
        int[][] C = new int[m][p];
        System.out.println("Enter elements of matrix A:");
        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
              A[i][j] = input.nextInt();
        System.out.println("Enter elements of matrix B:");
        for (int i = 0; i < n; i++)
            for (int j = 0; j < p; j++)
                B[i][j] = input.nextInt();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < p; j++) {
                for (int k = 0; k < n; k++) {
                    C[i][j] += A[i][k] * B[k][j];
                }
            }
        }
        System.out.println("Product matrix:");
        for (int i = 0; i < m; i++) {
            System.out.print("[");
            for (int j = 0; j < p; j++) {
                System.out.print(C[i][j] + " ");
            }
            System.out.println("]");
        }
    }
}


