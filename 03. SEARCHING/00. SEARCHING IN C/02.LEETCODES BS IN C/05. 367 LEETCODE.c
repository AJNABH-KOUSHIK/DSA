#include <stdio.h> // 367
#include <stdbool.h>
bool isPerfectSquareBinary(int x) {
    if (x < 0) return false;          // Negative numbers cannot be perfect squares
    if (x == 0 || x == 1) return true; // 0 and 1 are perfect squares
    long start = 1, end = x;
    while (start <= x) {
        long mid = start + (end - start) / 2;
        if (mid*mid == x) {
            return true;                // Found the perfect square
        } else if (mid*mid < x) {
            start = mid + 1;            // Search in the right half
        } else {
            end = mid - 1;              // Search in the left half
        }
    }
    return false;                       // No perfect square found
}
int main() {
    int x = 16;
    if (isPerfectSquareBinary(x)) {
        printf("%d is a perfect square.\n",x);
    } else {
        printf("%d is NOT a perfect square.\n", x);
    }
    return 0;
}
