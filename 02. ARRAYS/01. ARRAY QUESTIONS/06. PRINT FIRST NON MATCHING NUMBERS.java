// PRINT FIRST NON MATCHING NUMBER :
// Declare the first array of size n that stores values of int data type.
// Then take n integers input then store them in the array one by one.
// Then again declare a second array of size n integer inputs and store them in an array one by one.
// Then print the index where you find the first non matching number...

import java.util.*;
public class array{
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        int first=input.nextInt();
        int[] arr1=new int[first];
        for(int i=0;i<first;i++){
            arr1[i]=input.nextInt();
        }
        int second=input.nextInt();
        int[] arr2=new int[second];
        for(int i=0;i<second;i++){
            arr2[i]=input.nextInt();
        }
        for(int i=0;i<first;i++){
            for(int j=0;j<second;j++){
                  if(arr1[i]!=arr2[i]){
                    System.out.println(i);
                    break;
                  }
            }
        }

    }
}
// INPUT = 3
//       = 10
//       = 20
//       = 30
//       = 3
//       = 10
//       = 29
//       = 30
// OUTPT = 1
