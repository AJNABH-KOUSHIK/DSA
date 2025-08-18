#include <stdio.h>
#include <stdlib.h>
struct Node {
    int data;
    struct Node* next;
};
// DELETE NODE CODE STARTS
void deleteAtPosition(struct Node **head, int pos) {
    struct Node *temp = *head; 
    if (*head == NULL) return;  // Empty list guard: nothing to delete → exit immediately.
    if (pos == 1) {           // Special case: delete the first node
        *head = temp->next;
        free(temp);            // free(temp) releases the old first node’s memory (prevents a leak)
        return;               // because the deletion is complete; no further rewiring needed
    }
    for (int i = 1; i < pos-1 && temp->next != NULL; i++)
        temp = temp->next;
    struct Node *delNode = temp->next; // creating delnode
    if (delNode == NULL) return; 
    temp->next = delNode->next;
    free(delNode);
}
// DELETE NODE CODE ENDS
int main() {
    struct Node *head=NULL;
    struct Node *second=NULL;
    struct Node *third=NULL;
    head = (struct Node*)malloc(sizeof(struct Node));
    second = (struct Node*)malloc(sizeof(struct Node));
    third = (struct Node*)malloc(sizeof(struct Node));
    printf("Enter first node: ");
    scanf("%d",&head->data);
    printf("Enter second node: ");
    scanf("%d",&second->data);
    printf("Enter third node: ");
    scanf("%d",&third->data);
    head->next = second;
    second->next = third;
    third->next = NULL;
    struct Node* temp = head;
    printf("Original list: ");
    while(temp != NULL) {
        printf("%d -> ", temp->data);
        temp = temp->next;
    }
    printf("NULL\n");
    int num;
    printf("Enter the position to delete the node: ");
    scanf("%d",&num);
    deleteAtPosition(&head, num);
    temp = head;
printf("After deletion at position %d:\n", num);
    while(temp != NULL) {
        printf("%d -> ", temp->data);
        temp = temp->next;
    }
    printf("NULL\n");
    return 0;
}
