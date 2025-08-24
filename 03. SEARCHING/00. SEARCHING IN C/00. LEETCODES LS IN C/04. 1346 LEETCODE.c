#include <stdio.h>
#include <stdbool.h>
bool checkIfExist(int* arr, int arrSize) {
    for (int i = 0; i < arrSize; i++) {
        for (int j = 0; j < arrSize; j++) {
            if (i != j && arr[i] == 2 * arr[j]) {
                return true;
            }
        }
    }
    return false;
}
int main() {
    int arr[] = {10, 2, 5, 3};
    int n = sizeof(arr) / sizeof(arr[0]);
    if (checkIfExist(arr, n)) {
        printf("true\n");
    } else {
        printf("false\n");
    }
    return 0;
}
