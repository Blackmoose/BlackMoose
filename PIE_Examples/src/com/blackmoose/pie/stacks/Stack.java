package com.blackmoose.pie.stacks;
import java.util.ArrayList;


public class Stack<E> {
    private ArrayList<E> stack;
    private int top = -1; // index of the top item of the stack

    public Stack() {
        stack = new ArrayList<E>();
    }

    public void push(E obj) {
        stack.add(obj);
        top++;
    }

    public E pop() {
        if (top == -1) {
            return null; // stack is empty
        }
        E temp = stack.get(top);
        stack.remove(top);
        top--;
        return temp;
    }

    public boolean isEmpty(){
        return top == -1;
    }

    public int size() {
        return top+1;
    }
}