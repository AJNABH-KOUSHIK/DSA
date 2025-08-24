#include <stdio.h> // 704
// Function to perform Binary Search
int binarySearch(int arr[], int n, int key) {
    int start = 0, end = n - 1;
    while (start <= end) {
        int mid = (start + end) / 2;
        if (arr[mid] == key) {
            return mid;  // Element found at index mid
        }
        else if (arr[mid] < key) {
            start = mid + 1;  // Search in right half
        }
        else {
            end = mid - 1;    // Search in left half
        }
    }
    return -1; // Element not found
}
int main() {
    int arr[] = {2, 4, 6, 8, 10, 12, 14};
    int n = sizeof(arr) / sizeof(arr[0]);
    int key;
    printf("Enter element to search: ");
    scanf("%d", &key);
    int result = binarySearch(arr, n, key);
    if (result != -1)
        printf("Element found at index %d\n", result);
    else
        printf("Element not found\n");
    return 0;
}
