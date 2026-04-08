package level1;

public class Q17681 {
    public String[] solution(int n, int[] arr1, int[] arr2) {

        String[] answer = new String[n];

        for (int i = 0; i < n; i++) {
            String s = Integer.toBinaryString(arr1[i] | arr2[i]);

            while (s.length() < n) s = "0" + s;

            StringBuilder sb = new StringBuilder();

            for (int j = 0; j < n; j++) {
                sb.append(s.charAt(j) == '1' ? "#" : " ");
            }

            answer[i] = sb.toString();
        }

        return answer;
    }

    public String[] solutionReplace(int n, int[] arr1, int[] arr2) {

        String[] answer = new String[n];

        for (int i = 0; i < n; i++) {
            String s = Integer.toBinaryString(arr1[i] | arr2[i]);

            while (s.length() < n) s = "0" + s;

            answer[i] = s.replace('0', ' ').replace('1', '#');
        }

        return answer;
    }
}
