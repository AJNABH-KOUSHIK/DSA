import java.util.*;

public class PreviousSmaller {
    public static int[] prevSmaller(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        int[] res = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            while (!stack.isEmpty() && stack.peek() >= arr[i])
                stack.pop();
            res[i] = stack.isEmpty() ? -1 : stack.peek();
            stack.push(arr[i]);
        }

        return res;
    }

    public static void main(String[] args) {
        int[] arr = {4, 5, 2, 10, 8};
        System.out.println(Arrays.toString(prevSmaller(arr))); // [-1, 4, -1, 2, 2]
    }
}
