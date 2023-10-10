package medium.q150EvaluateReversePolishNotation;

import java.util.Set;
import java.util.Stack;

public class Solution {

    private final Set<String> set = Set.of("+", "-", "*", "/");

    public int evalRPN(String[] tokens) {
        Stack<Integer> ints = new Stack<>();
        Stack<String> signs = new Stack<>();
        for (String token : tokens) {
            if (set.contains(token)) {
                signs.push(token);
            } else {
                ints.push(Integer.valueOf(token));
            }

            while (ints.size() > 1 && !signs.isEmpty()) {
                int int2 = ints.pop();
                int int1 = ints.pop();
                int res = operate(int1, int2, signs.pop());
                ints.push(res);
            }
        }
        return ints.pop();
    }

    private int operate(int int1, int int2, String operand) {
        if ("+".equals(operand)) {
            return int1 + int2;
        } else if ("-".equals(operand)) {
            return int1 - int2;
        } else if ("*".equals(operand)) {
            return int1 * int2;
        } else if ("/".equals(operand)) {
            return int1 / int2;
        }
        throw new RuntimeException("Invalid operand " + operand);
    }
}