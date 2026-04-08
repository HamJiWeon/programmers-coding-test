package level2;

import java.util.*;

public class Q131701 {
    public int solution(int[] elements) {
        int[] circle = new int[elements.length * 2];

        for (int i = 0; i < circle.length; i++) {
            circle[i] = elements[i % elements.length];
        }

        Set<Integer> set = new HashSet<>();

        for (int i = 1; i <= elements.length; i++) {
            for (int j = 0; j < elements.length; j++) {

                int sum = 0;
                for (int k = 0; k < i; k++) {
                    sum += circle[j + k];
                }

                set.add(sum);
            }
        }

        return set.size();
    }

    public int solution2Loop(int[] elements) {
        int n = elements.length;
        Set<Integer> set = new HashSet<>();

        int[] circle = new int[n * 2];
        for (int i = 0; i < circle.length; i++) {
            circle[i] = elements[i % n];
        }

        for (int start = 0; start < n; start++) {

            int sum = 0;
            for (int len = 0; len < n; len++) {
                sum += circle[start + len];
                set.add(sum);
            }
        }

        return set.size();
    }
}
