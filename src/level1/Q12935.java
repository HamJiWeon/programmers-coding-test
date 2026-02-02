package level1;

public class Q12935 {
    public int[] solution(int[] arr) {
        int[] answer = new int[arr.length - 1];

        int min = Integer.MAX_VALUE;
        if (arr.length == 1) return new int[] {-1};

        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) min = arr[i];
        }

        int idx = 0;
        for (int n : arr) {
            if (min != n) {
                answer[idx] = n;
                idx++;
            }
        }

        return answer;
    }
}
