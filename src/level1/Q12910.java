package level1;

import java.util.*;

public class Q12910 {
    public int[] solution(int[] arr, int divisor) {

        int[] answer = Arrays.stream(arr)
                .filter(factor -> factor % divisor == 0)
                .sorted()
                .toArray();

        if (answer.length == 0) return new int[]{-1};

        return answer;
    }
}
