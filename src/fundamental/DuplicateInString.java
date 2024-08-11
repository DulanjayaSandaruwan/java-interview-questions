package fundamental;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class DuplicateInString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine();
        Set<Character> charSet = new LinkedHashSet<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            charSet.add(c);
        }
        StringBuilder sb = new StringBuilder();
        for (Character c : charSet) {
            sb.append(c);
        }
        System.out.println(sb);
    }
}
