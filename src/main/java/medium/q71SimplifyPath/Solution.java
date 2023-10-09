package medium.q71SimplifyPath;

import java.util.Stack;

public class Solution {

    public String simplifyPath(String path) {
        String[] split = path.split("/");
        Stack<String> stack = new Stack<>();

        for (String s : split) {
            if ("".equals(s) || ".".equals(s)) {
//                nothing to do
            } else if ("..".equals(s)) {
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            } else {
                stack.push(s);
            }
        }
        StringBuilder builder = new StringBuilder();
        for (String s : stack) {
            builder.append("/").append(s);
        }
        if (builder.isEmpty()) {
            builder.append("/");
        }
        return builder.toString();
    }
}