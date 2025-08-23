#include <stdio.h>
#include <string.h>
int main() {
    char arr[100];  // max 100 characters
    printf("Enter characters (as a word/string): ");
    scanf("%s", arr);   // automatically stores chars into array with '\0' at end
    char target;
    printf("Enter the target character: ");
    scanf(" %c", &target);  // space before %c ignores newline
    for (int i = 0; arr[i] != '\0'; i++) {  // loop until end of string
        if (arr[i] == target) {
            printf("The target '%c' is found at index %d\n", target, i);
            return 0;
        }
    }
    printf("The target character does not exist.\n");
    return 0;
}
