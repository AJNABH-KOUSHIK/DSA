#include <stdio.h> // 35
int searchInsert(int* nums, int numsSize, int target) {
    int start = 0, end = numsSize - 1;
    while (start <= end) {
        int mid = start + (end - start) / 2;
        if (nums[mid] == target) {
            return mid;          // target found
        } else if (nums[mid] < target) {
            start = mid + 1;    // search right half
        } else {
            end = mid - 1;      // search left half
        }
    }
    return start;
}
int main() {
    int nums[] = {1, 3, 5, 6};
    int n = sizeof(nums) / sizeof(nums[0]);
    int target = 2;
    int pos = searchInsert(nums, n, target);
    printf("Insert position: %d\n", pos);
    return 0;
}
