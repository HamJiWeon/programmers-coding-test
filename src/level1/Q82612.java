package level1;

public class Q82612 {
    public long solution(int price, int money, int count) {
        long answer = 0;

        for (int i = 1; i <= count; i++) {
            answer += (long) price * i;
        }

        if (answer < money) return 0;
        return answer - money;

    }
}
