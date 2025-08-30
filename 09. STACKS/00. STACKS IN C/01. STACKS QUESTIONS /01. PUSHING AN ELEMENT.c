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
    scanf("%d",&value);
    push(value);
    scanf("%d",&value);
    push(value);
    display();
    return 0;
}
