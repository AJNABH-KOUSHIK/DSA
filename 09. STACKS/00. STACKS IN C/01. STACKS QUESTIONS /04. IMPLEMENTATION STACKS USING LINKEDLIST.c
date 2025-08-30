#include <stdio.h>
#include <stdlib.h>
struct Node {
    int data;
    struct Node* next;
};
struct Node* top = NULL;
int is_empty() {
    return top == NULL;
}
void push(int value) {
    // Create a new node
    struct Node* newNode = (struct Node*)malloc(sizeof(struct Node));
    if (newNode == NULL) {
        printf("Stack overflow!\n");
        return;
    }
    newNode->data = value;
    newNode->next = top;
    top = newNode;
    printf("Pushed %d to the stack.\n", value);
}
int pop() {
    if (is_empty()) {
        printf("Stack underflow!\n");
        return -1; // Sentinel value
    }
    struct Node* temp = top;
    int popped_value = temp->data;
    top = top->next;
    free(temp); // Free memory
    return popped_value;
}

// Function to get the top element without removing it (Peek)
int peek() {
    if (is_empty()) {
        printf("Stack is empty.\n");
        return -1;
    }
    return top->data;
}

int main() {
    push(10);
    push(20);
    push(30);

    printf("Top element is: %d\n", peek());

    printf("Popped element: %d\n", pop());
    printf("Popped element: %d\n", pop());

    printf("Top element after pops: %d\n", peek());

    pop(); // Pop the last element
    pop(); // Demonstrate underflow

    return 0;
}
