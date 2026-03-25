package level1;

import java.util.*;

public class Q68644 {
    public int[] solution(int[] numbers) {
        // TreeSet을 사용하면 sorted() 자동
        Set<Integer> answer = new TreeSet<>();

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                answer.add(numbers[i] + numbers[j]);
            }
        }

        return answer.stream().mapToInt(i -> i).toArray();
    }
}
