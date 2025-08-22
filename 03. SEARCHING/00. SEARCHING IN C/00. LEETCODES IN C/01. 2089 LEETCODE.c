#include<stdio.h>
#include<stdlib.h>
int sort(const void *a,const void *b){ // ADDED LINES FOR SORTING IN C
    return (*(int*)a-*(int*)b); // ADDED LINES FOR SORTING IN C
} // ADDED LINES FOR SORTING IN C
int main(){
    int n;
    printf("Enter the number of elements : ");
    scanf("%d",&n);
    int arr[n];
    printf("Enter the elements : ",n);
    for(int i=0;i<n;i++){
        scanf("%d",&arr[i]);
    }
    qsort(arr,n,sizeof(int),sort); // ADDED LINES FOR SORTING IN C
    int target;
    printf("Enter the target element");
    scanf("%d",&target);
    for(int i=0;i<n;i++){
        if(arr[i]==target){
            printf("The target %d is in %d index",target,i);
            return 0;
        }
    }
    printf("The target doesn't exists");
    return 0;
}
