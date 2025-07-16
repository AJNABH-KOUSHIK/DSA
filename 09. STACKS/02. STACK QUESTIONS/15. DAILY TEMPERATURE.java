import java.util.Stack;

public class DailyTemperatures {
    public static int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] answer = new int[n];
        Stack<Integer> stack = new Stack<>(); // Stores indices

        for (int i = 0; i < n; i++) {
            // Check if current temperature is warmer than stack top
            while (!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]) {
                int prevIndex = stack.pop();
                answer[prevIndex] = i - prevIndex; // Difference in days
            }
            stack.push(i);
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] temps = {73, 74, 75, 71, 69, 72, 76, 73};
        int[] res = dailyTemperatures(temps);
        for (int days : res) {
            System.out.print(days + " ");
        }
        // Output: 1 1 4 2 1 1 0 0
    }
}
