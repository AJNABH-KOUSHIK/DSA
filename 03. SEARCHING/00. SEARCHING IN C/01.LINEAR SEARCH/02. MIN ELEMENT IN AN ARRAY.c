#include <stdio.h>
int main() {
    int arr[] = {1, 2, 3, 4, 5};
    int n = sizeof(arr) / sizeof(arr[0]);
    int ans = arr[0]; // assume first element is min
    for (int i = 1; i < n; i++) {
        if (arr[i] < ans) {
            ans = arr[i];
        }
    }
    printf("Minimum element = %d\n", ans);
    return 0;
}
