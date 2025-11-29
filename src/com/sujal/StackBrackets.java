package com.sujal;

import java.util.Stack;

public class StackBrackets {
    public static void main(String[] args) {
        String str = "()[]{}";
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // If opening bracket, push to stack
            if (ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch);
            } else {
                // If closing bracket, stack must not be empty
                if (stack.isEmpty()) {
                    System.out.println("false");
                    return;
                }

                char top = stack.pop();

                // Check matching pair
                if ((ch == ')' && top != '(') ||
                        (ch == ']' && top != '[') ||
                        (ch == '}' && top != '{')) {
                    System.out.println("false");
                    return;
                }
            }
        }

        // If stack empty → valid
        System.out.println(stack.isEmpty() ? "true" : "false");
    }
}
