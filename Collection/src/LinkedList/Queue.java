package LinkedList;

import java.util.LinkedList;

public class Queue {
    public static void main(String[] args){
        LinkedList<String> queue = new LinkedList<>();
        queue.offer("호랑이");
        queue.offer("사자");
        queue.offer("코끼리");

        while(!queue.isEmpty()) System.out.println(queue.poll());
    }
}
