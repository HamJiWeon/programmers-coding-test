package level1;

public class Q12931 {
    public int solution(int n) {
        int answer = 0;
        String number = String.valueOf(n);

        for (char c : number.toCharArray()) {
            answer += c - '0';
        }

        return answer;
    }
}
