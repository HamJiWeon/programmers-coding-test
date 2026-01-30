package level1;

import java.util.*;

public class Q12919 {
    public String solution(String[] seoul) {

        int idx = Arrays.asList(seoul).indexOf("Kim");

        return new StringBuilder("김서방은 ")
                .append(idx)
                .append("에 있다")
                .toString();
    }
}
