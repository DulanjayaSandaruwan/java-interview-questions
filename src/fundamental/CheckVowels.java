package fundamental;

public class CheckVowels {
    public static void main(String[] args) {
        String str = "aeiou";
        boolean isVowel = false;
        if (str.toLowerCase().matches(".*[aeiou].*")) {
            isVowel = true;
        } else {
            isVowel = false;
        }
        System.out.println(isVowel);
    }
}
