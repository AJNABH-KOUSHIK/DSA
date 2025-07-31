// Print Array Elements Consist Of Odd Numbers :

// Take n as an integer input. Declare an array of size n that stores value of int data-type.
// Then take n integer inputs and store them in the array one by one.
// Then print all the indexes of the array from the starting where the elements are odd

import java.util.Scanner;
public class array{
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        int n= input.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
             arr[i]=input.nextInt();             
        }
        for(int i=0;i<n;i++){
            if(arr[i]%2!=0){
              System.out.println(i);
            }
        }
    }
}
