#include <stdio.h> //162
int findPeakElement(int* nums, int size) {
    int start = 0, end = size - 1;
    while (start < end) {
        int mid = start + (end - start) / 2;
        if (nums[mid] < nums[mid + 1]) {
            // Ascending part → peak must be to the right
            start = mid + 1;
        } else {
            // Descending part → peak could be mid or left
            end = mid;
        }
    }

    // start == end, this is a peak index
    return start;
}
int main() {
    int nums[] = {1, 2, 1, 3, 5, 6, 4};
    int size = sizeof(nums) / sizeof(nums[0]);

    int peakIndex = findPeakElement(nums, size);
    printf("Peak index: %d, value: %d\n", peakIndex, nums[peakIndex]);

    return 0;
}
