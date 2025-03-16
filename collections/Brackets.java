package collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Brackets {

    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        Map<Character,Character> bracketPairs = Map.of(')','(',']','[','}','{');

        for (char ch : s.toCharArray()) {
            if (bracketPairs.containsValue(ch)) {
                stack.push(ch);
            } else if (bracketPairs.containsKey(ch)) {
                if (stack.isEmpty() || bracketPairs.get(ch) != stack.pop())
                    return false;
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String test = "[}";
        System.out.println(isValid(test));

    }

}
