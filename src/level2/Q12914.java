package level2;

public class Q12914 {
    public long solution(int n) {
        if (n == 1) return 1;
        if (n == 2) return 2;

        long[] arr = new long[n + 1];
        arr[1] = 1;
        arr[2] = 2;

        for (int i = 3; i <= n; i++) {
            arr[i] = (arr[i - 1] + arr[i - 2]) % 1234567;
        }

        return arr[n];
    }

    public long solutionPrev(int n) {
        if (n <= 2) return n;

        long prev2 = 1;
        long prev1 = 2;
        long answer = 0;

        for (int i = 3; i <= n; i++) {
            answer = (prev1 + prev2) % 1234567;

            prev2 = prev1;
            prev1 = answer;
        }

        return answer;
    }
}
