// PRINT 2D ARRAY
// Take n as an integer input. Declare an array of size n that stores value of int data-type.
// Then take n integer inputs and store them in the array one by one. 
// Print 2D Array 
import java.util.Scanner;
public class Print2DArray{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n=input.nextInt();
        int[][] arr=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=input.nextInt();
            }
        }
        for(int i=0;i<n;i++){
            System.out.print("[");
            for(int j=0;j<n;j++){
                System.out.print(arr[i][j]+"");
            }
            System.out.println("]");
        }
    }
}
// INPUT = 3
//       = 1 2 3 4 5 6 7 8 9
// OUTPUT = [ 1 2 3 ]
//        = [ 4 5 6 ]
//        = [ 7 8 9 ]
