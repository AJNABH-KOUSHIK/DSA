#include <stdio.h>
int main() {
    int n;
    printf("Enter the number of elements: ");
    scanf("%d", &n);
    int arr[n];
    printf("Enter %d numbers:\n", n);
    for (int i = 0; i < n; i++) {
        scanf("%d", &arr[i]);
    }
    printf("Entered numbers are: ");
    for (int i = 0; i < n; i++) {
        printf("%d ", arr[i]);
    }
    int answer = 0;
    printf("\nNumbers with even number of digits are: ");
    for (int i = 0; i < n; i++) {
        int k = arr[i];
        int count = 0;
        while (k > 0) {
                k = k / 10;
                count++;
        }
        if (count % 2 == 0) {
            printf("%d ", arr[i]);  // print number with even digits
            answer++;
        }
    }
    printf("\nTotal count = %d\n", answer);
    return 0;
}
