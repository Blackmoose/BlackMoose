package com.blackmoose.pie.stacks;

public class StackRunner {

	 /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<Integer>();

        st.push(5);
        st.push(4);
        st.push(3);
        st.push(9);

        if (st.size() == 0) {
            System.out.println("Stack is empty.");
        } else {
            System.out.println("Stack contains " + st.size() + " items.");
        }

        while (!st.isEmpty()) {
            System.out.println(st.pop());
        }

        if (st.size() == 0) {
            System.out.println("Stack is empty.");
        } else {
            System.out.println("Stack contains " + st.size() + " items.");
        }
        st.push(7);

        System.out.println("Size: " + st.size());
        System.out.println(st.pop());
        System.out.println("Done");
    }
	
	
	
}
