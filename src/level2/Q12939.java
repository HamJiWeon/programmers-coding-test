package level2;

public class Q12939 {
    public String solution(String s) {

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        String[] arr = s.split(" ");

        for (String str : arr) {
            int i = Integer.parseInt(str);

            if (min > i) min = i;
            if (max < i) max = i;
        }

        return min + " " + max;
    }
}
