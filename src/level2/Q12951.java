package level2;

public class Q12951 {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();

        String[] arr = s.split("");
        sb.append(arr[0].toUpperCase());
        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1].equals(" ")) sb.append(arr[i].toUpperCase());
            else sb.append(arr[i].toLowerCase());
        }


        return sb.toString();
    }
}
