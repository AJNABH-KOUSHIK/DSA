// MIN_MAX ARRAY :
// Take n as an integer input. Declare an array of size n that stores value of int data-type.
// Then take n integer inputs and store them in the array one by one. 
// You are required to find the span of the input.
// Span is defined as difference of MAX VALUE of MIN VALUE

import java.util.Scanner;
public class MinMaxSpan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int min = arr[0];
        int max = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        int span = max - min;
        System.out.println("Span = " + span); 
    }
}

// INPUT = 5
//       = 1 2 3 4 5
// OUTPUT = Span = 4
