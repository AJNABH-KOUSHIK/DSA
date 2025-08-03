import java.util.Scanner; // Import Scanner to read user input
public class MatrixDiagonalSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  // Create Scanner object
        int n = sc.nextInt();  // Read size of matrix (n x n)
        int[][] mat = new int[n][n];  // Declare a 2D array
        // Read matrix elements
        for (int i = 0; i < n; i++) {          // For each row
            for (int j = 0; j < n; j++) {      // For each column in that row
                mat[i][j] = sc.nextInt();      // Read matrix value from user
            }
        }
        int result = diagonalSum(mat);         // Call function to calculate sum
        System.out.println(result);            // Print final result
    }
    // Function to calculate the sum of diagonals
    public static int diagonalSum(int[][] mat) {
        int n = mat.length;   // Get number of rows (or columns, since it's square)
        int sum = 0;          // Initialize sum to 0
        for (int i = 0; i < n; i++) {  // n=3
          // Sum primary diagonal → from top-left to bottom-right.
         //  Sum secondary diagonal → from top-right to bottom-left.
            sum += mat[i][i];  // Add primary diagonal element (i, i)
        //   i = 0 → mat[0][0] = 1 → sum = 1
       //   i = 1 → mat[1][1] = 5 → sum = 6
       //   i = 2 → mat[2][2] = 9 → sum = 15
            sum += mat[i][n - 1 - i];     // Add secondary diagonal element (i, n-1-i)
        //  i = 0 → 3-1-0 = mat[0][2] = 3 → sum = 3
       // i = 1 → 3-1-1 = mat[1][1] = 5 → sum = 8
      // i = 2 → 3-1-2 = mat[2][0] = 7 → sum = 15
        }
        // If n is odd, subtract the center element once
        if (n % 2 == 1) {
            sum -= mat[n / 2][n / 2];     // Center element counted twice, subtract one
        }
        return sum;  // Return the final sum
    }
}
