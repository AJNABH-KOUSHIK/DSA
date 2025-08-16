#include <stdio.h>
#include <stdlib.h>
struct Node {
    int data;
    struct Node* next;
};
int main() {
    struct Node *head=NULL;
 // Best practice → Always initialize pointers to NULL.
 // If we don’t, they may contain garbage addresses and can cause segmentation faults.
   struct Node *second=NULL;
   struct Node *third=NULL;
 // Allocate memory here to allocate we will use malloc
    head = (struct Node*)malloc(sizeof(struct Node)); 
    // Here malloc... will return void pointer but we want pointer to node so we have to type cast so we will use now (struct Node*)
    second = (struct Node*)malloc(sizeof(struct Node));
    third = (struct Node*)malloc(sizeof(struct Node));
    // Assign data
    printf("enter first node");
    scanf("%d",&head->data);
    // (*head).data == head->data
    // head is a pointer to a struct Node
    // head->data accesses the data field
    // head->next accesses the next pointer field
    printf("enter second node");
    scanf("%d",&second->data);
    printf("enter third node");
    scanf("%d",&third->data);
    head->next = second;
    second->next = third;
    third->next = NULL;
    // Print list
    struct Node* temp = head;
    while(temp != NULL) {
        printf("%d -> ", temp->data);
        temp = temp->next;
    }
    printf("NULL\n");
    return 0;
}
