class MyStack {
    int maxSize;
    int[] stackArray;
    int top;

    public MyStack(int size) {
        maxSize = size;
        stackArray = new int[maxSize];
        top = -1;
    }

    public void push(int value) {
        if (top < maxSize - 1)
            stackArray[++top] = value;
    }

    public int pop() {
        if (top >= 0)
            return stackArray[top--];
        return -1;
    }

    public int peek() {
        if (top >= 0)
            return stackArray[top];
        return -1;
    }

    public boolean isEmpty() {
        return top == -1;
    }
}
