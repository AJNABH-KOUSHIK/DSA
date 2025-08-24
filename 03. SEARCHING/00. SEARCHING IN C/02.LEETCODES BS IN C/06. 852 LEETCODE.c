#include <stdio.h> // 852
int peakIndexInMountainArray(int* arr, int arrSize) {
    int start = 0, end = arrSize - 1;
    while (start < end) {
        int mid = start + (end - start) / 2;
        if (arr[mid] < arr[mid + 1]) {
            // Ascending part of the mountain
            start = mid + 1;
        } else {
            // Descending part of the mountain
            end = mid;
        }
    }
    // start == end, peak index
    return start;
}
int main() {
    int arr[] = {0, 2, 4, 7, 5, 3, 1};
    int size = sizeof(arr) / sizeof(arr[0]);
    int peak = peakIndexInMountainArray(arr, size);
    printf("Peak index is: %d\n", peak);
    return 0;
}
