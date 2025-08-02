// PRINT THE ARRAY ELEMENTS LINEWISE :
// Take n as an integer input. Declare an array of size n that stores value of int data-type.
// Then take n integer inputs and store them in the array one by one. 
// Then print each integer in each line
import java.util.Scanner;
public class LinewiseArrayPrinter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }
}
// INPUT   = 1
//         = 2
//         = 3
//         = 4
//         = 5
-----------------------
// OUTPUT  = 5
//         = 4
//         = 3
//         = 2
//         = 1
