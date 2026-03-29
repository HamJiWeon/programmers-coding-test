package level1;

import java.util.*;

public class Q81301 {
    public int solution(String s) {

        HashMap<String, String> number = new HashMap<>();

        number.put("zero", "0");
        number.put("one", "1");
        number.put("two", "2");
        number.put("three", "3");
        number.put("four", "4");
        number.put("five", "5");
        number.put("six", "6");
        number.put("seven", "7");
        number.put("eight", "8");
        number.put("nine", "9");

        for (String key : number.keySet()) {
            s = s.replaceAll(key, number.get(key));
        }

        return Integer.parseInt(s);
    }

    // 배열과 인덱스를 활용해서 풀기
    public int solutionArr(String s) {
        String[] arr = {
                "zero",
                "one",
                "two",
                "three",
                "four",
                "five",
                "six",
                "seven",
                "eight",
                "nine"
        };

        for (int i = 0; i < arr.length; i++) {
            s = s.replaceAll(arr[i], String.valueOf(i));
        }

        return Integer.parseInt(s);
    }
}
