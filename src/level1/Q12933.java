package level1;

public class Q12933 {
    public long solution(long n) {
        long answer = 0;

        int[] count = new int[10];

        while (n > 0) {
            count[(int)(n % 10)]++;
            n /= 10;
        }

        for (int digit = 9; digit >= 0; digit--) {
            while (count[digit]-- > 0) {
                answer = answer * 10 + digit;
            }
        }

        return answer;
    }
}
