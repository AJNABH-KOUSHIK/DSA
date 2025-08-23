#include <stdio.h>

int main() {
    int n, target, index = -1;

    // Input size
    printf("Enter number of elements: ");
    scanf("%d", &n);

    int arr[n];

    // Input array elements
    printf("Enter the elements: ");
    for (int i = 0; i < n; i++) {
        scanf("%d", &arr[i]);
    }

    // Input target
    printf("Enter the element to search: ");
    scanf("%d", &target);

    // Linear Search for last occurrence
    for (int i = 0; i < n; i++) {
        if (arr[i] == target) {
            index = i;  // keep updating index until the last match
        }
    }

    // Output
    if (index != -1) {
        printf("Last occurrence of %d is at index %d\n", target, index);
    } else {
        printf("Element not found\n");
    }

    return 0;
}
