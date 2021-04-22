package stack;

import java.util.Stack;
public class StackImplementation {

    public static void main(String[] args) {
        // Create a new stack
        Stack<Integer> stack = new Stack<>();

        // Push 6 items
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);

        // Pop items from the stack until its empty
        while (!stack.empty()) {
            System.out.println(stack.pop());
        }
    }
}

	


