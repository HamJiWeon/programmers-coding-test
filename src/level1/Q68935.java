package level1;

public class Q68935 {
    public int solution(int n) {

        String three = Integer.toString(n, 3);

        return Integer.parseInt(new StringBuilder(three)
                .reverse()
                .toString(), 3);
    }
}
