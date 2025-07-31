// Take n as an integer input. Declare an array of size n that stores value of int data-type.
// Then take n integer inputs and store them in the array one by one
// Your given an another number d
// Your required to check if d exists in the array a and at what index ( 0 based ) If found print the index other wise print -1
import java.util.Scanner;
public class array{
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        int n= input.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
             arr[i]=input.nextInt();             
        }
        System.out.println("Your target is");
        Scanner inputs= new Scanner(System.in);
        int target=inputs.nextInt();
        for(int i=0;i<n;i++){
              if(arr[i]==target){
                System.out.println("Your target index is:"+i);
              }
              else{
                System.out.println("-1");
                break;
              }
        }
    }
}
// INPUT  = 5 
//        = 1
//        = 2
//        = 3
//        = 4
//        = 5
//        = 4
// OUTPUT = Your target index is: 3
