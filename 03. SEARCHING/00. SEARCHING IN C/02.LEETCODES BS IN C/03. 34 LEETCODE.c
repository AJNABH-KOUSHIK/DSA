#include <stdio.h>
#include <stdlib.h>  // 34
int findFirst(int* nums, int n, int target) {
    int index = -1;
    int start = 0, end = n - 1;
    while (start <= end) {
        int mid = start + (end - start) / 2;
        if (nums[mid] >= target) end = mid - 1;
        else start = mid + 1;
        if (nums[mid] == target) index = mid;
    }
    return index;
}
int findLast(int* nums, int n, int target) {
    int index = -1;
    int start = 0, end = n - 1;
    while (start <= end) {
        int mid = start + (end - start) / 2;
        if (nums[mid] <= target) start = mid + 1;
        else end = mid - 1;
        if (nums[mid] == target) index = mid;
    }
    return index;
}
int* searchRange(int* nums, int n, int target, int* returnSize) {
    *returnSize = 2;
    int* result = (int*)malloc(2 * sizeof(int));
    result[0] = findFirst(nums, n, target);
    result[1] = findLast(nums, n, target);
    return result;
}
int main() {
    int arr[] = {1, 2, 2, 2, 3, 4};
    int n = sizeof(arr) / sizeof(arr[0]);
    int target = 2;
    int returnSize;
    int* range = searchRange(arr, n, target, &returnSize);
    printf("First = %d, Last = %d\n", range[0], range[1]);
    free(range);  
    return 0;
}
