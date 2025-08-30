#include <stdio.h>
#include <string.h>
#define limit 100 
int top = -1;
char stack[limit];
void push(char c) {
    if ((top + 1) == limit) {
        printf("Stack overflow\n");
        return;
    }
    top++;
    stack[top] = c;
}
char pop() {
    if (top == -1) {
        return '\0'; 
    }
    char popped_char = stack[top];
    top--;
    return popped_char;
}
int isValidParentheses(char* c) {
    int len = strlen(c);
    for (int i = 0; i < len; i++) {
        char current_char = c[i];
        if (current_char == '(' || current_char == '{' || current_char == '[') {
            push(current_char);
        } else if (current_char == ')' || current_char == '}' || current_char == ']') {
            char popped_char = pop();
            // Check for underflow or a mismatched pair
            if (popped_char == '\0' || 
                (current_char == ')' && popped_char != '(') ||
                (current_char == '}' && popped_char != '{') ||
                (current_char == ']' && popped_char != '[')) {
                return 0; // Invalid
            }
        }
    }

    return top == -1; // Valid if the stack is empty at the end
}

int main() {
    char c1[] = "()[]{}";
    char c2[] = "([{}])";
    char c3[] = "([)]";

    printf("String: \"%s\" -> %s\n", c1, isValidParentheses(c1) ? "Valid" : "Invalid");
    top = -1; // Reset stack for the next check
    printf("String: \"%s\" -> %s\n", c2, isValidParentheses(c2) ? "Valid" : "Invalid");
    top = -1;
    printf("String: \"%s\" -> %s\n", c3, isValidParentheses(c3) ? "Valid" : "Invalid");

    return 0;
}
