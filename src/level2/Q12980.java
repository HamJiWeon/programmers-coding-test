package level2;

public class Q12980 {
    public int solution(int n) {
        int ans = 0;

        while (n > 0) {
            if (n % 2 == 1) ans++;
            n /= 2;
        }

        return ans;
    }

    public int solutionBitCount(int n) {
        return Integer.bitCount(n);
    }
}
