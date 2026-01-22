package level1;

public class Q12934 {
    public long solution(long n) {
        long answer = 0;

        double sqrt = Math.sqrt(n);

        if (sqrt == (int) sqrt) {
            long number = (long) Math.pow((sqrt + 1), 2);
            return number;
        } else return -1;
    }
}
