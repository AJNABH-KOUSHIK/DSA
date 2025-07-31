// Print Array Elements Reverse Linewise
// Take n as an integer input. Declare an array of size n that stores value of int data-type.
// Then take n integer inputs and store them in the array one by one. 
// Then print the elements of the array from the last index till the 0th index such that each element is printed one by one in each line.
import java.util.Scanner;
public class Reverse{
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        int n=input.nextInt();
        int[] arr= new int[n];
        for(int i=0;i<n;i++){
             arr[i]=input.nextInt();
        }
        for(int i=n-1;i>=0;i--){
            System.out.println(arr[i]);
        }

    }
}
