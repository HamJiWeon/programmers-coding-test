package level2;

import java.util.*;

public class Q42578 {
    public int solution(String[][] clothes) {
        int answer = 1;

        Map<String, Integer> map = new HashMap<>();

        for (String[] c : clothes) {
            map.put(c[1], map.getOrDefault(c[1], 0) + 1);
        }

        for (int v : map.values()) {
            answer *= (v + 1);
        }

        return answer - 1;
    }

    public int solutionMerge(String[][] clothes) {
        int answer = 1;

        Map<String, Integer> map = new HashMap<>();

        for (String[] c : clothes) {
            map.merge(c[1], 1, Integer::sum);
        }

        for (int v : map.values()) {
            answer *= v + 1;
        }

        return answer - 1;
    }
}
