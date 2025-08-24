#include <stdio.h>
int bs(int start, int end, int* nums, int target) {
    while (start <= end) {
        int mid = start + (end - start) / 2;
        if (target == nums[mid]) {
            return mid;
        }
        if (target < nums[mid]) {
            end = mid - 1;
        } else {
            start = mid + 1;
        }
    }
    return -1;
}
int pivot(int* nums, int numsSize) {
    int start = 0, end = numsSize - 1;
    while (start <= end) {
        int mid = start + (end - start) / 2;
        if (mid < end && nums[mid] > nums[mid + 1]) {
            return mid;
        }
        if (mid > start && nums[mid] < nums[mid - 1]) {
            return mid - 1;
        }
        if (nums[mid] <= nums[start]) {
            end = mid - 1;
        } else {
            start = mid + 1;
        }
    }
    return -1;
}
int search(int* nums, int numsSize, int target) {
    int p = pivot(nums, numsSize);
    // If no pivot → normal binary search
    if (p == -1) {
        return bs(0, numsSize - 1, nums, target);
    }
    // If pivot is the target
    if (nums[p] == target) {
        return p;
    }
    // Decide which side to search
    if (target >= nums[0]) {
        return bs(0, p - 1, nums, target);
    }
    return bs(p + 1, numsSize - 1, nums, target);
}
int main() {
    int nums[] = {4,5,6,7,0,1,2};
    int size = sizeof(nums) / sizeof(nums[0]);
    int target = 0;
    int result = search(nums, size, target);
    if (result != -1) {
        printf("Target %d found at index %d\n", target, result);
    } else {
        printf("Target %d not found\n", target);
    }
    return 0;
}
