package level1;

public class Q87389 {
    public int solution(int n) {
        int answer = n - 1;

        for (int i = 2; i * i <= answer; i++) {
            if (n % i == 1) return i;
        }

        return answer;
    }
}
