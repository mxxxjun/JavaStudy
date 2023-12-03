package LinkedList;

import java.util.ArrayDeque;
import java.util.Deque;

public class arrayDeque {
    public static void main(String[] args){
        Deque<String> stack = new ArrayDeque<>();
        stack.push("호랑이");
        stack.push("사자");
        stack.push("코끼리");
        stack.addLast("기린");

        while(!stack.isEmpty()) System.out.println(stack.pop());
    }
}
