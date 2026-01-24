package level1;

public class Q12912 {
    public long solution(int a, int b) {
        long min = Math.min(a, b);
        long max = Math.max(a, b);
        long n = max - min + 1;

        return (min + max) * n / 2;
    }
}
