package LinkedList;

import java.util.Stack;

public class StackTest {
    public static void main(String[] args){
        Stack<String> stack = new Stack<>();
        stack.push("호랑이");
        stack.push("사자");
        stack.push("코끼리");

        while(!stack.empty()) System.out.println(stack.pop());
    }
}
