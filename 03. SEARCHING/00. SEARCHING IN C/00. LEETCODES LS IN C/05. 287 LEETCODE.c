#include <stdio.h>
int findDuplicate(int* nums, int numsSize) {
    for (int i = 0; i < numsSize; i++) {
        for (int j = i + 1; j < numsSize; j++) {
            if (nums[i] == nums[j]) {
                return nums[i];
            }
        }
    }
    return -1; // should never happen as per problem statement
}
// Example usage
int main() {
    int nums[] = {1, 3, 4, 2, 2};
    int n = sizeof(nums) / sizeof(nums[0]);
    printf("Duplicate: %d\n", findDuplicate(nums, n));
    return 0;
}
