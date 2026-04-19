package level2;

import java.util.*;

public class Q42747 {
    public int solution(int[] citations) {
        int answer = 0;

        citations = Arrays.stream(citations)
                .boxed()
                .sorted(Collections.reverseOrder())
                .mapToInt(Integer::intValue)
                .toArray();

        for (int i = 0; i < citations.length; i++) {
            if (citations[i] >= i + 1) answer = i + 1;
            else break;
        }



        return answer;
    }
}
