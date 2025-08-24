#include <stdio.h> // 69
int mySqrt(int x) {
    if (x == 0 || x == 1) {
        return x; // sqrt(0) = 0, sqrt(1) = 1
    }
    int start = 1, end = x, ans = 0;
    while (start <= end) {
        long mid = start + (end - start) / 2; // avoid overflow
        if (mid * mid == x) {
            return mid; // perfect square
        }
        else if (mid * mid < x) {
            start = mid + 1;
            ans = mid; // store floor value
        }
        else {
            end = mid - 1;
        }
    }
    return ans; // floor(sqrt(x))
}
int main() {
    int x;
    printf("Enter a number: ");
    scanf("%d", &x);
    printf("Square root of %d = %d\n", x, mySqrt(x));
    return 0;
}
