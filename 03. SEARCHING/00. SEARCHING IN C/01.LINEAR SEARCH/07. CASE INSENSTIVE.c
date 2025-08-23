#include <stdio.h>
#include <string.h>
#include <ctype.h>

int main() {
    char str[] = "HelloWorld";
    char target = 'o';

    for (int i = 0; i < strlen(str); i++) {
        if (tolower(str[i]) == tolower(target)) {
            printf("Found %c (case-insensitive) at index %d\n", target, i);
            return 0;
        }
    }
    printf("Not found\n");
    return 0;
}
