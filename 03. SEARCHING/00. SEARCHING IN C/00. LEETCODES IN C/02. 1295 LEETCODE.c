#include <stdio.h>
#include <stdlib.h>
int findNumbers(int *nums,int numsize){
    int count=0;
    for(int i=0;i<numsize;i++){
    int x=abs(nums[i]);
    int digit=0;
    if(x==0){
        digit=1;
    }else{
        while(x>0){
            digit++;
            x/=10;
        }
    }
    if((digit&1)==0){
        count++;
    }
    }
    return count;
}
int main() {
    int nums[] = {12, 345, 2, 6, 7896};
    int n = sizeof(nums) / sizeof(nums[0]); //is a classic trick in C to calculate the number of elements in an array. 4*5/4=5
    int result = findNumbers(nums, n);
    printf("Count = %d\n", result);  
    return 0;
}
