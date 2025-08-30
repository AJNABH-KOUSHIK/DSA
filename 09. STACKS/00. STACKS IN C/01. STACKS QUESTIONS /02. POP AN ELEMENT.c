#include <stdio.h>
#define limit 5
int top=-1;
int stack[limit];
void push(int value){
    if((top+1)==limit){
        printf("Stack overflow");
        return;
    }
    top++;
    stack[top]=value;
}
void pop(){
    if(top==-1){
        printf("Stack is empty");
        return;
    }
    top--;
    printf("Popped element is :%d",stack[top+1]);
}
void display(){
    if(top==-1){
        printf("Stack is empty");
        return;
    }
    printf("The stack elements are:");
    for(int i=0;i<=top;i++){
        printf("%d ",stack[i]);
    }
}
int main() {
    printf("Enter the value to push(press x to exit):");
    int value;
    char choice;
    while (1) {
        printf("\nEnter your choice: ");
        scanf(" %c", &choice); 
         if (choice == 'x') {
            printf("Exiting program.\n");
            break;
        } else if (choice == 'p') {
            printf("Enter the value to push: ");
            scanf("%d", &value);
            push(value);
            display();
        }  else {
            printf("Invalid choice. Please try again.\n");
}
    }
        pop();
 display();
    return 0;
}
