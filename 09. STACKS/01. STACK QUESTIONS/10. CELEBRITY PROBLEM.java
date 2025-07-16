public class CelebrityProblem {
    static int[][] M = {
        {0, 1, 1},
        {0, 0, 1},
        {0, 0, 0}
    };

    static boolean knows(int a, int b) {
        return M[a][b] == 1;
    }

    public static int findCelebrity(int n) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < n; i++) stack.push(i);

        while (stack.size() > 1) {
            int a = stack.pop(), b = stack.pop();
            if (knows(a, b)) stack.push(b);
            else stack.push(a);
        }

        int c = stack.pop();
        for (int i = 0; i < n; i++) {
            if (i != c && (knows(c, i) || !knows(i, c)))
                return -1;
        }
        return c;
    }

    public static void main(String[] args) {
        System.out.println(findCelebrity(3)); // Output: 2
    }
}
