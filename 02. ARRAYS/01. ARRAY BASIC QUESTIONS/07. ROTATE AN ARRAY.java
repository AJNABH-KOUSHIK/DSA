// ROTATE AN ARRAY :
// You are given a number n , representing the size of array a
// You are given n numbers , representing elements of a array a
// You are given a number k
// Rotate an array a , k times to the right ( for positive value of k ) and to the left for negative values of k

import java.util.*;
public class array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();             
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();        
        k = k % n;              
        reverse(arr, 0, n - 1);
        reverse(arr, 0, k - 1);
        reverse(arr, k, n - 1);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}

// INPUT = 5
//       = 1 2 3 4 5
//       = 3
// OUTPUT = 3 4 5 1 2
