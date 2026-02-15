package level1;

import java.util.*;

public class Q12982 {
    public int solution(int[] d, int budget) {
        int answer = 0;

        Arrays.sort(d);

        for (int i : d) {
            budget -= i;
            if (budget < 0) break;
            answer++;
        }

        return answer;
    }
}
