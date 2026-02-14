package level1;

public class Q131705 {
    static int answer = 0;

    public int solution(int[] number) {
        answer = 0;
        DFS(number, 0, 0, 0);

        return answer;
    }

    public void DFS(int[] number, int trio, int start, int sum) {
        if (trio == 3 && sum == 0) answer++;

        for (int i = start; i < number.length; i++) {
            DFS(number, trio + 1, i + 1, sum + number[i]);
        }
    }
}
