#include <stdio.h>
int main() {
    int a[3][3], i, j, nz = 0;
    printf("Enter elements of 3x3 matrix:\n");
    for (i = 0; i < 3; i++) {
        for (j = 0; j < 3; j++) {
            scanf("%d", &a[i][j]);
            if (a[i][j] == 0) {
                nz++;  
            }
        }
    }
    printf("\nThe Matrix is:\n");
    for (i = 0; i < 3; i++) {
        for (j = 0; j < 3; j++) {
            printf("%d\t", a[i][j]);
        }
        printf("\n");
    }
    if (nz <= 3*3/2) {
        printf("\nNot a Sparse Matrix.\n");
    } else {
        int s[9][3], k = 0;
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                if (a[i][j] != 0) {
                    s[k][0] = i;       
                    s[k][1] = j;       
                    s[k][2] = a[i][j]; 
                    k++;
                }
            }
        }
        printf("\nSparse Matrix representation is:\n");
        printf("Row\tCol\tValue\n");
        for (i = 0; i < k; i++) {
            printf("%d\t%d\t%d\n", s[i][0], s[i][1], s[i][2]);
        }
    }
    return 0;
}
