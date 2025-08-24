import java.util.Scanner;

public class Search2DArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int m = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int n = sc.nextInt();

        int arr[][] = new int[m][n];
        System.out.println("Enter elements row-wise:");
        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
                arr[i][j] = sc.nextInt();

        System.out.print("Enter target element: ");
        int target = sc.nextInt();

        boolean found = false;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i][j] == target) {
                    System.out.println("Element found at (" + i + "," + j + ")");
                    found = true;
                    break;
                }
            }
            if (found) break;
        }
        if (!found) System.out.println("Element not found.");
        sc.close();
    }
}
