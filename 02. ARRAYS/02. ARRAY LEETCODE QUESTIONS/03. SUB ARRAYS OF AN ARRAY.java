// LEETCODE 53
// SUB ARRAYS OF AN ARRAY :
// You are given an array of size n and n elements of the same array.
// You are required to find and print all the subarrays of the given array.
// Each subarray should be space separated and on a separate line. Refer to sample input and output.

import java.util.Scanner;
public class AllSubarrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for(int start = 0; start < n; start++) {
            for(int end = start; end < n; end++) {
                for(int k = start; k <= end; k++) {
                    System.out.print(arr[k] + " ");
                }
                System.out.println(); 
            }
        }
    }
}

// INPUT = 3
//       = 1 2 3
// OUTPUT = 1
// 1 2
// 1 2 3
// 2
// 2 3
// 3
