package level2;

import java.util.*;

public class Q131127 {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;

        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < want.length; i++) {
            map.put(want[i], number[i]);
        }

        for (int i = 0; i <= discount.length - 10; i++) {
            Map<String, Integer> discountMap = new HashMap<>();

            for (int j = i; j < i + 10; j++) {
                discountMap.put(discount[j], discountMap.getOrDefault(discount[j], 0) + 1);
            }

            if (isSame(map, discountMap)) {
                answer++;
            }
        }

        return answer;
    }

    boolean isSame(Map<String, Integer> map, Map<String, Integer> discountMap) {
        for (String key : map.keySet()) {
            if (!discountMap.containsKey(key) || discountMap.get(key) < map.get(key)) {
                return false;
            }
        }

        return true;
    }
}
