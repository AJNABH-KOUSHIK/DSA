import java.util.*;
public class twosum {
    public static void main(String[] args) {
        int[] arr={2,7,11,15};
        int target=9;
        // As arrays are seperate library we have to import that library and to pretty print the array elements by using toString method...
        // If we directly print arrays we can get hex values so
        // Here by using println we are calling toString indirectly without writing but it is stored in stack memory so for heap...
        // toString() method is actually a string method which is called automatically when we print
        // Here by using toString method directly it means that it is stored in heap memory where the non primitive data types are stores so we use 
        // so to call toString method in arrays we use Arrays.toString()
        // toString method mainly for the pretty print
        System.out.println(Arrays.toString(answer(arr, target)));
        // Without using toString hex values are printed...
    }
    static int[] answer(int[] arr,int target){ // function defining 
        // That’s a static method. Inside it, you're calling answer(arr, target) directly. In Java:
       // You can call other static methods directly inside a static context (like in main).
       // You cannot call a non-static method directly from within a static method without an object instance.
      // This is a compile-time error known as "non-static method cannot be referenced from a static context.."
        for (int i =0; i <arr.length ; i++) {  
            for (int j = i+1; j <arr.length ; j++) {
                      int sum=arr[i]+arr[j];
                      if(sum==target){
                   return new int[]{i,j};
             }
                }
             
            }
        return new int[]{-1,-1}; // Because if there is no such case where target is equals to 9 so we will use the index
        //  as -1,-1 because there are no negative integers in arrays
    }
}
