#include <stdio.h>
int main() {
    int n;
    printf("Enter the n : ");
    scanf("%d", &n);
    int arr[n];
    printf("Enter the elements : ");
    for (int i = 0; i < n; i++) {
        scanf("%d", &arr[i]);
    }
    for (int i = 0; i < n; i++) {
        for (int j = i + 1; j < n; j++) {
            if (arr[i] == arr[j]) {
                printf("Repeated number is : %d\n", arr[i]);
                return 0;   // stop after finding first duplicate
            }
        }
    }
    printf("No repeated number found\n");
    return 0;
}
