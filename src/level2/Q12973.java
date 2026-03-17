package level2;

import java.util.*;

public class Q12973 {
    public int solution(String s) {
        Deque<Character> dq = new ArrayDeque<>();

        for (char c : s.toCharArray()) {
            if (dq.isEmpty() || dq.peek() != c) {
                dq.push(c);
            }
            else {
                dq.pop();
            }
        }

        return dq.isEmpty() ? 1 : 0;
    }
}
