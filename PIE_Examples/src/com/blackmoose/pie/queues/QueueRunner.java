package com.blackmoose.pie.queues;

public class QueueRunner {

	 /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Queue<Integer> st = new Queue<Integer>();

        st.enQueue(5);
        st.enQueue(4);
        st.enQueue(3);
        st.enQueue(9);

        if (st.size() == 0) {
            System.out.println("Stack is empty.");
        } else {
            System.out.println("Stack contains " + st.size() + " items.");
        }

        while (!st.isEmpty()) {
            System.out.println(st.deQueue());
        }

        if (st.size() == 0) {
            System.out.println("Stack is empty.");
        } else {
            System.out.println("Stack contains " + st.size() + " items.");
        }
        st.enQueue(7);

        System.out.println("Size: " + st.size());
        System.out.println(st.deQueue());
        System.out.println("Done");
    }
	
	
	
}
