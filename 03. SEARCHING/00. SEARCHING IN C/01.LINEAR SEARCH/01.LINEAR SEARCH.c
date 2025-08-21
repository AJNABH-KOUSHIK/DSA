#include<stdio.h>
int main(){
    int n;
    printf("Enter the n : ");
    scanf("%d",&n);
    int arr[n];
    printf("Enter the elements : ",n);
    for(int i=0;i<n;i++){
        scanf("%d",&arr[i]);
    }
    int target;
    printf("Enter the target element : ");
    scanf("%d",&target);
    for(int i=0;i<n;i++){
        if(arr[i]==target){
            printf("Target element index is : %d",i);
            return 0;
        }
    }
    printf("Target element not found");
    return 0;
}
