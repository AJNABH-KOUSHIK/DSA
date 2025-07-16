import java.util.Stack;

class GetMinElementStack {
    Stack<Integer> mainStack = new Stack<>();
    Stack<Integer> minStack = new Stack<>();

    // Push element into stack
    public void push(int x) {
        mainStack.push(x);
        if (minStack.isEmpty() || x <= minStack.peek()) {
            minStack.push(x);
        }
    }

    // Pop element from stack
    public void pop() {
        if (mainStack.peek().equals(minStack.peek())) {
            minStack.pop();
        }
        mainStack.pop();
    }

    // Return top element
    public int top() {
        return mainStack.peek();
    }

    // Return the minimum element
    public int getMin() {
        return minStack.peek();
    }

    public static void main(String[] args) {
        GetMinElementStack s = new GetMinElementStack();
        s.push(5);
        s.push(3);
        s.push(7);
        s.push(2);
        s.pop();
        System.out.println("Top Element: " + s.top());       // 7
        System.out.println("Min Element: " + s.getMin());    // 3
    }
}
