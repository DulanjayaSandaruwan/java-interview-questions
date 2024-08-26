package fundamental;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class JoinUpperCaseStrings {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("cat", "dog", "cow");
        String s = joinUpperCaseStrings(list);
        System.out.println(s);
    }

    public static String joinUpperCaseStrings(List<String> list) {
        String collect = list.stream().map(String::toUpperCase).collect(Collectors.joining(","));
        return collect;
    }
}
