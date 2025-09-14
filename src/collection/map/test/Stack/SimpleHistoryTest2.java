package collection.map.test.Stack;

import java.util.ArrayDeque;

public class SimpleHistoryTest2 {
    public static void main(String[] args) {
        ArrayDeque<String> stack = new ArrayDeque<>();
        stack.push("youtube.com");
        stack.push("google.com");
        stack.push("facebook.com");

        stack.pop();
        System.out.println(stack);


    }
}
