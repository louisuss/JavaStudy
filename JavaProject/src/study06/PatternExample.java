package study06;

import java.util.regex.Pattern;

public class PatternExample {
    public static void main(String[] args) {
        String regExp = "(02|010)-\\d{3,4}-\\d{4}";
        String data = "010-123-4567";
        boolean res = Pattern.matches(regExp, data);
        System.out.println(res);

        regExp = "\\w+@\\w+\\.\\w+(\\.\\w+)?";
        data = "angel@naver.com";
        res = Pattern.matches(regExp, data);
        System.out.println(res);
    }
}
