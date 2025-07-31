// PRINT ARRAY ELEMENTS OF COUNT EVEN NUMBERS :

// Take n as an integer input. Declare an array of size n that stores value of int data-type. 
// Then take n integer inputs and store them in the array one by one.
// Print the count number of even numbers of elements in the array

import java.util.Scanner;
public class array{
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        int n= input.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
             arr[i]=input.nextInt();             
        }
        int evencount = count(arr,n);
        System.out.println(" EVEN NUMBERS ARE :"+evencount);
    }
        static int count(int[] arr,int n){
        int c=0;
        for(int i=0;i<n;i++){
            if(arr[i]%2==0){
                c++;
            }
        }
        return c;
        }
    }
// INPUT   = 1
//         = 2
//         = 3
//         = 4
//         = 5
// OUTPUT = EVEN NUMBERS ARE : 2
