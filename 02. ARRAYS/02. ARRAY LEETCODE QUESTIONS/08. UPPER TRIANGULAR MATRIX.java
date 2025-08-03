// Print Upper Triangular Matrix using JAVA
public class UpperTriangularDemo {
    public static void main(String[] args) {
        int[][] mat = {
            { 4,  -1,  2 },
            { 3,   7,  0 },
            { 5,   1, -6 }
        };
        int rows = mat.length;
        int cols = mat[0].length;   // assumes at least one row
        System.out.println("Upper‑triangular part of the matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                // If below main diagonal → print 0; else print original value
                int val = (i > j) ? 0 : mat[i][j]; 
                // [0][0]= i=0;j=0
                // [1][1]= i=1;j=1
                // [1][2]= i=1;j=2 ............
                System.out.print(val + (j < cols - 1 ? " " : ""));
                // Purpose of j < cols - 1: print a space only if there is another column to print.
            }
            System.out.println();
        }
    }
}
