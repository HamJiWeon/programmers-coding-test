package level1;

public class Q12926 {
    public String solution(String s, int n) {
        char[] arr = s.toCharArray();

        for (int i = 0; i < arr.length; i++) {
            char ch = arr[i];

            if (ch == ' ') continue;

            if (ch >= 'a' && ch <= 'z') {
                arr[i] = (char) ((ch - 'a' + n) % 26 + 'a');
            } else if (ch >= 'A' && ch <= 'Z') {
                arr[i] = (char) ((ch - 'A' + n) % 26 + 'A');
            }
        }

        return new String(arr);
    }
}
