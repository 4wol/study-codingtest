package codility.lesson.stacks_and_queues;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Brackets {
    public static void main(String[] args) {
        System.out.println(solution("{[()()]}")); // 1
        System.out.println(solution("([)()]")); // 0
        System.out.println(solution("")); // 1
        System.out.println(solution("(")); // 0
        System.out.println(solution(")")); // 0
        System.out.println(solution("))")); // 0
        System.out.println(solution("(((((")); // 0
    }

    public static int solution(String S) {
        Map<Character, Character> map = new HashMap<>();
        map.put('}', '{');
        map.put(']', '[');
        map.put(')', '(');

        Stack<Character> stack = new Stack<>();

        char[] arr = S.toCharArray();
        for (char a : arr) {
            if(a == '{' || a == '[' || a == '(') {
                stack.push(a);
            }else {
                if(stack.isEmpty()) {
                    return 0;
                }

                if(stack.peek() == map.get(a)) {
                    stack.pop();
                }
            }
        }

        return stack.size() == 0 ? 1 : 0;
    }
}
