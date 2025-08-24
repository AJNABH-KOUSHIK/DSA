#include <stdio.h>
// Function to find the k-th missing positive number
int findKthPositive(int* arr, int arrSize, int k) {
    int missingCount = 0;
    int current = 1;   // Start checking from 1
    int index = 0;     // Pointer into arr
    // Keep going until we find the kth missing number
    while (1) {
        if (index < arrSize && arr[index] == current) {
            // current number is present in arr → skip it
            index++;
        } else {
            // current number is missing
            missingCount++;
            if (missingCount == k) {
                return current;
            }
        }
        current++;
    }
}
int main() {
    int n, k;
    // Input array size
    printf("Enter the size of the array: ");
    scanf("%d", &n);
    int arr[n];
    // Input array elements (assume sorted)
    printf("Enter %d elements in sorted order: ", n);
    for (int i = 0; i < n; i++) {
        scanf("%d", &arr[i]);
    }
    // Input k
    printf("Enter the value of k: ");
    scanf("%d", &k);
    // Find and print the k-th missing positive number
    int result = findKthPositive(arr, n, k);
    printf("The %d-th missing positive number is: %d\n", k, result);
    return 0;
}
