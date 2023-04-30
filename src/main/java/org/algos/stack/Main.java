package org.algos.stack;

public class Main {
    public static void main(String[] args) {
        Stack stack = new Stack(3);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.printStack();

        System.out.println();

        stack.push(11);

        System.out.println();

        stack.pop();
        stack.pop();
        stack.printStack();

        System.out.println();

        Stack emptyStack = new Stack(0);
        emptyStack.pop();
    }
}
