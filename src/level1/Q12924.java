package level1;

public class Q12924 {
    public int solution(int n) {
        int answer = 0;
        int sum = 0;
        int lt = 1;

        for (int rt = 1; rt <= n; rt++) {
            sum += rt;

            while (sum > n) {
                sum -= lt;
                lt++;
            }

            if (sum == n) {
                answer++;
            }
        }

        return answer;
    }
}
