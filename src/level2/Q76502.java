package level2;

import java.util.*;

public class Q76502 {
    public int solution(String s) {
        int answer = 0;

        for (int i = 0; i < s.length(); i++) {
            String rotate = s.substring(i) + s.substring(0, i);

            if (isMatch(rotate)) answer++;
        }

        return answer;
    }

    private boolean isMatch(String s) {
        Deque<Character> stack = new ArrayDeque<>();

        for (char c : s.toCharArray()) {
            if (c == '(') stack.push(')');
            else if (c == '{') stack.push('}');
            else if (c == '[') stack.push(']');
            else if (stack.isEmpty() || stack.pop() != c) return false;
        }

        return stack.isEmpty();
    }

    public int solutionRefactor(String s) {
        int answer = 0;
        int n = s.length();
        if (n % 2 != 0) return 0;

        String ss = s + s;

        for (int i = 0; i < n; i++) {
            if (isMatchRefactor(ss, i, n)) {
                answer++;
            }
        }
        return answer;
    }

    public boolean isMatchRefactor(String s, int start, int len) {
        Deque<Character> stack = new ArrayDeque<>();

        for (int i = start; i < start + len; i++) {
            char c = s.charAt(i);
            if (c == '(') stack.push(')');
            else if (c == '{') stack.push('}');
            else if (c == '[') stack.push(']');
            else {
                if (stack.isEmpty() || stack.pop() != c) return false;
            }
        }
        return stack.isEmpty();
    }
}
