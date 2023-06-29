package collections.Stack.practice;

import java.util.*;
public class StackDetails {
    public static void main(String[] args) {
        Stack<Object> s = new Stack<>();
        System.out.println("Stack is empty? " + s.empty());
        s.push("A");
        s.push("B");
        s.push("C");
        
        System.out.println(s);
        System.out.println(s.search("A"));
        System.out.println(s.search("Z"));
        System.out.println("Top of the stack removed: "+ s.pop());
        System.out.println(s);

        System.out.println("Top of the stack without removing: " + s.peek());
    }
}
