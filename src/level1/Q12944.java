package level1;

public class Q12944 {
    public double solution(int[] arr) {
        double answer = 0;

        for (int score : arr) {
            answer += score;
        }

        return answer / arr.length;
    }
}
