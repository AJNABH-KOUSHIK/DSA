#include <stdio.h> //540
int singleNonDuplicate(int* nums, int numsSize) {
    int start = 0, end = numsSize - 1;
    while (start < end) {
        int mid = start + (end - start) / 2;
        // Ensure mid is even for pairing check
        if (mid % 2 == 1) mid--;
        // Check if the pair is valid
        if (nums[mid] == nums[mid + 1]) {
            // Single element is after this pair
            start = mid + 2;
        } else {
            // Single element is before or at mid
            end = mid;
        }
    }
    // start == end, the single element
    return nums[start];
}
int main() {
    int nums[] = {1,1,2,3,3,4,4,8,8};
    int size = sizeof(nums) / sizeof(nums[0]);

    int result = singleNonDuplicate(nums, size);
    printf("The single element is: %d\n", result);

    return 0;
}
