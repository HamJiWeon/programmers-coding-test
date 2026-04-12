package level2;

public class Q12985 {
    public int solution(int n, int a, int b) {
        int answer = 0;

        while (a != b) {
            a = (a + 1) / 2;
            b = (b + 1) / 2;

            answer++;
        }

        return answer;
    }

    public int solutionXor(int n, int a, int b) {

        return Integer.toBinaryString((a - 1) ^ (b - 1)).length();
    }
}
