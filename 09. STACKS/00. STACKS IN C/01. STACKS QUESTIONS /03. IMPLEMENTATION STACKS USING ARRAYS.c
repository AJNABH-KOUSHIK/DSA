#include <stdio.h>
#define SIZE 5
int stack[SIZE];
int top = -1;
void push(int x) {
    if (top == SIZE - 1)
        printf("Overflow\n");
    else
        stack[++top] = x;
}
int pop() {
    if (top == -1)
        return -1;   // Underflow
    return stack[top--];
}
void display() {
    for (int i = top; i >= 0; i--)
        printf("%d ", stack[i]);
    printf("\n");
}
int main() {
    push(10);
    push(20);
    push(30);
    display();  // 30 20 10
    printf("Popped: %d\n", pop());  // 30
    printf("Popped: %d\n", pop());  // 20
    display(); // 10
    return 0;
}
