package org.example.queue.reverse_a_queue;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class ReverseQueue {

    public static void reversingQueue(Queue<Integer> queue){
        Stack<Integer> st=new Stack<>();
        while(!queue.isEmpty()){
            int ele=queue.remove();
            st.push(ele);
        }
        while(!st.isEmpty()){
            int ele=st.pop();
            queue.add(ele);
        }
    }

    public static void main(String[] args) {
        Queue<Integer> queue=new ArrayDeque<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);

        System.out.println("Queue before reverse : " +queue);
        reversingQueue(queue);
        System.out.println("Queue after reverse  : " +queue);
    }
}
