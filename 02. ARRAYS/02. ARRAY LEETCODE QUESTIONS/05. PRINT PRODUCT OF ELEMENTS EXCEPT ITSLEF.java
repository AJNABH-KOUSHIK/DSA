// PRINT SUM OF ELEMNETS EXCEPT ITSELF
// Decalre the first array of size n that stores values of int data type.
// Then take n integer inputs then store them in the array one by one.
// For each index print the sum of all the elements excpet the element present at the index

import java.util.*;

public class array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();             
        int[] arr = new int[n];
        int totalSum = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            totalSum *= arr[i];       // 10
        }
        for (int i = 0; i < n; i++) {
            System.out.println(totalSum - arr[i]);  // 10-1,10-2,10-3,10-4
        }
    }
}

// INPUT = 4
//       = 2
//       = 7
//       = 8
//       = 9
// OUTPUT = 24
//        = 19
//        = 18
//        = 17
