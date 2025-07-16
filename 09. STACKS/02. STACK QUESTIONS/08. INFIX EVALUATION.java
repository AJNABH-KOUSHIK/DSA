import java.util.*;

public class InfixEvaluation {
    public static int precedence(char op) {
        if (op == '+' || op == '-') return 1;
        if (op == '*' || op == '/') return 2;
        return 0;
    }

    public static int applyOp(int a, int b, char op) {
        switch (op) {
            case '+': return a + b;
            case '-': return a - b;
            case '*': return a * b;
            case '/': return a / b;
        }
        return 0;
    }

    public static int evaluate(String expr) {
        Stack<Integer> values = new Stack<>();
        Stack<Character> ops = new Stack<>();

        for (int i = 0; i < expr.length(); i++) {
            char c = expr.charAt(i);
            if (c == ' ') continue;
            if (Character.isDigit(c)) {
                int val = 0;
                while (i < expr.length() && Character.isDigit(expr.charAt(i)))
                    val = val * 10 + (expr.charAt(i++) - '0');
                values.push(val);
                i--;
            } else if (c == '(') {
                ops.push(c);
            } else if (c == ')') {
                while (ops.peek() != '(')
                    values.push(applyOp(values.pop(), values.pop(), ops.pop()));
                ops.pop();
            } else {
                while (!ops.isEmpty() && precedence(ops.peek()) >= precedence(c))
                    values.push(applyOp(values.pop(), values.pop(), ops.pop()));
                ops.push(c);
            }
        }

        while (!ops.isEmpty())
            values.push(applyOp(values.pop(), values.pop(), ops.pop()));

        return values.pop();
    }

    public static void main(String[] args) {
        System.out.println(evaluate("10 + 2 * 6")); // 22
    }
}
