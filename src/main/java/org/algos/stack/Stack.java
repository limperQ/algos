package org.algos.stack;

import java.util.Arrays;

public class Stack {
    private final int[] stack;
    private int top;

    public Stack(int size) {
        stack = new int[size];
        top = -1;
    }

    public void push(int value) {
        if (isFull()) {
            System.out.println("Stack is full, can`t insert.");
            return;
        }
        stack[++top] = value;
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return 0;
        }
        int retValue = stack[top];
        stack[top--] = 0;
        return retValue;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return stack.length - 1 == top;
    }

    public int size() {
        return top + 1;
    }

    public void printStack() {
        Arrays.stream(stack).forEach(System.out::println);
    }
}
