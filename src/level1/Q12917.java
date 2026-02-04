package level1;

import java.util.*;

public class Q12917 {
    public String solution(String s) {

        char[] ch = s.toCharArray();
        Arrays.sort(ch);

        return new StringBuilder(new String(ch))
                .reverse()
                .toString();
    }
}
