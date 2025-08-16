#include <stdio.h>
#include <stdlib.h>
struct Node { // same for both singly and doubly
    int data; // same for both singly and doubly
    struct Node *next, *prev; // same for both singly and doubly
}; // same for both singly and doubly
int main() { // same for both singly and doubly
    struct Node *head=NULL; // same for both singly and doubly
    struct Node *temp=NULL; // same for both singly and doubly
    struct Node *newNode=NULL; // same for both singly and doubly
    int n,val;
    printf("How many nodes? ");
    scanf("%d", &n);
    for (int i = 0; i < n; i++) {
        printf("Enter value: ");
        scanf("%d", &val);
        newNode = (struct Node*)malloc(sizeof(struct Node)); 
        newNode->data = val; 
        newNode->next = NULL;
        newNode->prev = NULL;
        if (!head) {
            head = newNode;
        } else {
            temp = head;
            while (temp->next)
            temp = temp->next;
            temp->next = newNode;
            newNode->prev = temp;
        }
    }
    printf("Forward: \n");
    temp = head;
    while (temp!=NULL) {  // same for both singly and doubly
        printf("%d ", temp->data);
        if (temp->next == NULL) break;// same for both single and doubly
        temp = temp->next; // same for both singly and doubly
    } 
    printf("\nReverse: \n");
    while (temp!=NULL) {  // same for both singly and doubly
        printf("%d ", temp->data); // same for both single and doubly
        temp = temp->prev; // same for both singly and doubly
    } // same for both singly and doubly
     // same for both singly and doubly
    return 0; // same for both singly and doubly
} // same for both singly and doubly
