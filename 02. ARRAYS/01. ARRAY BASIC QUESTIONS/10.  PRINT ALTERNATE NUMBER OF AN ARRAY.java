// PRINT ALTERNATE NUMBER OF AN ARRAY :
// Take n as an integer input. Declare an array of size n that stores value of int data-type.
// Then take n integer inputs and store them in the array one by one. 
// Then print the alternate elements of the array starting from 0th index
import java.util.Scanner;
public class MinMaxSpan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<n;i+=2){
            System.out.println(arr[i]);
        }
    }
}
// INPUT = 5
//       = 1
//       = 2
//       = 3
//       = 4
//       = 5
// OUTPUT = 1
//        = 3
//        = 5
