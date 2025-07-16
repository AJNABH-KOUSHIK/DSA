import java.util.Stack;

public class NextGreaterElement {
    public static void printNGE(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        for (int i = arr.length - 1; i >= 0; i--) {
            while (!stack.isEmpty() && stack.peek() <= arr[i])
                stack.pop();
            int next = stack.isEmpty() ? -1 : stack.peek();
            System.out.println(arr[i] + " -> " + next);
            stack.push(arr[i]);
        }
    }

    public static void main(String[] args) {
        int[] arr = {4, 5, 2, 25};
        printNGE(arr);
    }
}
