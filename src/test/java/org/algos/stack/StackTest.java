package org.algos.stack;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
class StackTest {

    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @Test
    void pushInFullStack() {
        Stack stack = new Stack(0);
        stack.push(10);
        Assertions.assertThat(outputStreamCaptor.toString().trim()).isEqualTo("Stack is full, can`t insert.");
    }

    @Test
    void pushInNotFullStack() {
        Stack stack = new Stack(1);
        stack.push(10);
        Assertions.assertThat(stack.pop()).isEqualTo(10);
    }


    @Test
    void popEmptyStack() {
        Stack stack = new Stack(2);
        stack.pop();
        Assertions.assertThat(outputStreamCaptor.toString().trim()).isEqualTo("Stack is empty.");
    }

    @Test
    void stackIsEmpty() {
        Stack stack = new Stack(3);
        Assertions.assertThat(true).isEqualTo(stack.isEmpty());
    }

    @Test
    void stackIsFull() {
        Stack stack = new Stack(3);
        stack.push(1);
        stack.push(1);
        stack.push(1);
        Assertions.assertThat(true).isEqualTo(stack.isFull());
    }
}