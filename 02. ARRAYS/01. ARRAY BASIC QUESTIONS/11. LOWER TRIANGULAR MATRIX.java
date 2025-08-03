public class LowerTriangularMatrix {
    public static void main(String[] args) {
        int[][] mat = {
            {4, 0, 0},
            {3, 5, 0},
            {1, 2, 6}
        };
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                // Print 0 if above the diagonal, else print the matrix element
                System.out.print((i < j ? 0 : mat[i][j]) + " ");
            }
            System.out.println();
        }
    }
}
