public class KStacks {
    int[] arr;     // array to store actual content
    int[] top;     // top[i] is the top index of i-th stack
    int[] next;    // next free or link to next entry
    int n, k;
    int free;      // index of the beginning of the free list

    // Constructor to create k stacks in an array of size n
    public KStacks(int k1, int n1) {
        k = k1;
        n = n1;
        arr = new int[n];
        top = new int[k];
        next = new int[n];

        // Initialize all stacks as empty
        for (int i = 0; i < k; i++)
            top[i] = -1;

        // Initialize all spaces as free and chain them
        for (int i = 0; i < n - 1; i++)
            next[i] = i + 1;
        next[n - 1] = -1;
        free = 0; // start of free list
    }

    // Check if there is space available
    public boolean isFull() {
        return (free == -1);
    }

    // Push element 'x' into stack number 'sn'
    public void push(int x, int sn) {
        if (isFull()) {
            System.out.println("Stack Overflow");
            return;
        }

        int i = free;         // index to insert element
        free = next[i];       // update free to next

        arr[i] = x;           // insert element
        next[i] = top[sn];    // link to previous top
        top[sn] = i;          // update top to new element
    }

    // Pop element from stack number 'sn'
    public int pop(int sn) {
        if (isEmpty(sn)) {
            System.out.println("Stack Underflow");
            return -1;
        }

        int i = top[sn];       // get top index
        top[sn] = next[i];     // update top to next element
        next[i] = free;        // put index i in free list
        free = i;

        return arr[i];         // return popped element
    }

    // Check if a stack is empty
    public boolean isEmpty(int sn) {
        return (top[sn] == -1);
    }

    // Print current status of stacks (debugging)
    public void printStacks() {
        for (int i = 0; i < k; i++) {
            System.out.print("Stack " + i + ": ");
            int t = top[i];
            while (t != -1) {
                System.out.print(arr[t] + " ");
                t = next[t];
            }
            System.out.println();
        }
    }

    // Main method
    public static void main(String[] args) {
        int k = 3, n = 10;
        KStacks ks = new KStacks(k, n);

        ks.push(15, 2);
        ks.push(45, 2);
        ks.push(17, 1);
        ks.push(49, 1);
        ks.push(39, 1);
        ks.push(11, 0);
        ks.push(9, 0);
        ks.push(7, 0);

        System.out.println("Popped from stack 2: " + ks.pop(2));
        System.out.println("Popped from stack 1: " + ks.pop(1));

        ks.printStacks();
    }
}
