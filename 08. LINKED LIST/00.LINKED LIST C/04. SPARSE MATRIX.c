#include <stdio.h>
#include <stdlib.h>
typedef struct Node {
    int row;
    int col;
    int value;
    struct Node* next;
} Node;
// Function to create a new node
Node* createNode(int row, int col, int value) {
    Node* newNode = (Node*)malloc(sizeof(Node));
    newNode->row = row;
    newNode->col = col;
    newNode->value = value;
    newNode->next = NULL;
    return newNode;
}
// Function to insert a node into the linked list
Node* insertNode(Node* head, int row, int col, int value) {
    Node* newNode = createNode(row, col, value);
    if (head == NULL) {
        head = newNode;
    } else {
        Node* temp = head;
        while (temp->next != NULL) {
            temp = temp->next;
        }
        temp->next = newNode;
    }
    return head;
}
// Function to display the sparse matrix
void displaySparseMatrix(Node* head, int rows, int cols) {
    Node* temp = head;
    for (int i = 0; i < rows; i++) {
        for (int j = 0; j < cols; j++) {
            if (temp != NULL && temp->row == i && temp->col == j) {
                printf("%d ", temp->value);
                temp = temp->next;
            } else {
                printf("0 ");
            }
        }
        printf("\n");
    }
}
int main() {
    int rows, cols, numNonZero;
    Node* head = NULL;
    printf("Enter the number of rows and columns: ");
    scanf("%d %d", &rows, &cols);
    printf("Enter the number of non-zero elements: ");
    scanf("%d", &numNonZero);
    for (int i = 0; i < numNonZero; i++) {
        int r, c, val;
        printf("Enter row, column, and value of element %d: ", i + 1);
        scanf("%d %d %d", &r, &c, &val);
        head = insertNode(head, r, c, val);
    }
    printf("\nThe sparse matrix is:\n");
    displaySparseMatrix(head, rows, cols);
    // Free the linked list
    Node* temp;
    while (head != NULL) {
        temp = head;
        head = head->next;
        free(temp);
    }
    return 0;
}
