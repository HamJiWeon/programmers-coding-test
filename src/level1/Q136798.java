package level1;

public class Q136798 {
    public int solution(int number, int limit, int power) {
        int answer = 0;

        for (int i = 1; i <= number; i++) {
            int cnt = 0;

            for (int j = 1; j * j <= i; j++) {
                if (j * j == i) cnt++;
                else if (i % j == 0) cnt += 2;
            }

            if (cnt <= limit) answer += cnt;
            else answer += power;
        }

        return answer;
    }

    public int solutionSieveOfEratosthenes(int number, int limit, int power) {
        int answer = 0;
        int[] counts = new int[number + 1];

        for (int i = 1; i <= number; i++) {
            for (int j = i; j <= number; j += i) {
                counts[j]++;
            }
        }

        for (int i = 1; i <= number; i++) {
            if (counts[i] > limit) {
                answer += power;
            } else {
                answer += counts[i];
            }
        }

        return answer;
    }
}
