package org.example.stack;

public class Stack {

    java.util.Stack<Integer> stack = new java.util.Stack<>();

    public void setStack() {
        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println(stack);

        while (!stack.empty()){
            System.out.println(stack.pop());
        }
    }

    public void getStack() {
        System.out.println(stack);
    }
}
