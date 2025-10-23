#include <stdio.h>
#include <stdlib.h>
struct Node {
    int data;
    struct Node *prev;  // Pointer to previous node
    struct Node *next;  // Pointer to next node
};
int main() {
    struct Node *head = NULL;
    struct Node *second = NULL;
    struct Node *third = NULL;
    // Allocate memory for 3 nodes
    head = (struct Node*)malloc(sizeof(struct Node));
    second = (struct Node*)malloc(sizeof(struct Node));
    third = (struct Node*)malloc(sizeof(struct Node));
    // Input data for nodes
    printf("Enter first node data: ");
    scanf("%d", &head->data);
    printf("Enter second node data: ");
    scanf("%d", &second->data);
    printf("Enter third node data: ");
    scanf("%d", &third->data);
    // Link the nodes (double links)
    head->prev = NULL;      // first node's prev = NULL
    head->next = second;    // first node's next = second
    second->prev = head;    // second's prev = head
    second->next = third;   // second's next = third
    third->prev = second;   // third's prev = second
    third->next = NULL;     // last node's next = NULL
    // Print list forward
    printf("\nDoubly Linked List (forward):\n");
    struct Node* temp = head;
    while (temp != NULL) {
        printf("%d <-> ", temp->data);
        temp = temp->next;
    }
    printf("NULL\n");
    // Print list backward (using prev pointers)
    printf("\nDoubly Linked List (backward):\n");
    temp = third;  // start from last node
    while (temp != NULL) {
        printf("%d <-> ", temp->data);
        temp = temp->prev;
    }
    printf("NULL\n");
    // Free allocated memory
    free(head);
    free(second);
    free(third);
    return 0;
}
