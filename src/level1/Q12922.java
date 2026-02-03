package level1;

public class Q12922 {
    public String solution(int n) {
        StringBuilder answer = new StringBuilder();

        if (n % 2 == 0) return answer.append("수박".repeat(n / 2)).toString();
        else return answer.append("수박".repeat(n / 2) + "수").toString();
    }
}
