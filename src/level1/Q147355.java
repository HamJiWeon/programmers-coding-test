package level1;

public class Q147355 {
    public int solution(String t, String p) {
        int answer = 0;
        long number = Long.parseLong(p);

        for (int rt = 0; rt <= t.length() - p.length(); rt++) {
            int lt = rt + p.length();

            if (Long.parseLong(t.substring(rt, lt)) <= number) answer++;
        }

        return answer;
    }
}
