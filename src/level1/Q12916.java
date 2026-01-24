package level1;

public class Q12916 {
    boolean solution(String s) {

        String str = s.toUpperCase();
        int p = 0;
        int y = 0;

        for (char c : str.toCharArray()) {
            if (c == 'P') p++;
            if (c == 'Y') y++;
        }

        return p == y;
    }
}
