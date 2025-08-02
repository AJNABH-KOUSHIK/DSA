// COMPARE BOTH MATRICES ARE SAME OR NOT :
// You have to take two matrices as input. First Matrix of size m1n1.
// Second Matrix of size m2n2.
// Compare the two matrices and print "Same" if both the matrices are same else print "Not Same"

import java.util.Scanner;
public class MatrixComparisonInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of rows for the first matrix:");
        int m1 = scanner.nextInt();
        System.out.println("Enter the number of columns for the first matrix:");
        int n1 = scanner.nextInt();
        int[][] matrix1 = readMatrix(m1, n1, scanner);
        System.out.println("\nEnter the number of rows for the second matrix:");
        int m2 = scanner.nextInt();
        System.out.println("Enter the number of columns for the second matrix:");
        int n2 = scanner.nextInt();
        int[][] matrix2 = readMatrix(m2, n2, scanner);
        System.out.println("\nComparing the two matrices:");
        compareMatrices(matrix1, matrix2);
        scanner.close();
    }
    public static int[][] readMatrix(int rows, int cols, Scanner scanner) {
        int[][] matrix = new int[rows][cols];
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        return matrix;
    }
     public static void compareMatrices(int[][] matrix1, int[][] matrix2) {
        if (matrix1.length != matrix2.length || matrix1[0].length != matrix2[0].length) {
            System.out.println("Not Same");
            return;
        }
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1.length; j++) {
                if (matrix1[i][j] != matrix2[i][j]) {
                    System.out.println("Not Same");
                    return;
                }
            }
        }
        System.out.println("Same");
    }
}

// INPUT : 3
//       : 3
//       : 1 2 3 4 5 6 7 8 9
//       : 3
//       : 3
//       : 1 2 3 4 5 6 7 8 9
// OUPUT : Same
