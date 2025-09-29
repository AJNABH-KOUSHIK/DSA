#include <stdio.h>
int findKthPositive(int* arr, int arrSize, int k) {
    int i = 0;
    int j = 0;
    while (i < arrSize) {
        j++;
        if (j != arr[i]) {
            k--;
        } else {
            i++;
        }
        if (k == 0) {
            return j;
        }
    }
    
}

int main() {
    int n, k;
    printf("Enter the number of elements: ");
    scanf("%d", &n);
    int arr[n];
    printf("Enter %d sorted numbers:\n", n);
    for (int i = 0; i < n; i++) {
        scanf("%d", &arr[i]);
    }
    printf("Entered numbers are: ");
    for (int i = 0; i < n; i++) {
        printf("%d ", arr[i]);
    }
    printf("\nEnter k: ");
    scanf("%d", &k);
    int result = findKthPositive(arr, n, k);
    printf("The %dth missing positive number is: %d\n", k, result);

    return 0;
}
