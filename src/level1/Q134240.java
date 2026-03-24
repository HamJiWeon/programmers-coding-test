package level1;

public class Q134240 {
    public String solution(int[] food) {
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i < food.length; i++) {
            sb.append(String.valueOf(i).repeat(food[i] / 2));
        }

        return sb.toString() + "0" + sb.reverse();
    }

    // 자바 21 이상일 때 sb.repeat()을 바로 쓸 수 있음.
    public String solutionWithRepeat(int[] food) {
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i < food.length; i++) {
            sb.repeat(String.valueOf(i), food[i] / 2);
        }

        return sb.toString() + "0" + sb.reverse();
    }
}
