package fundamental;

public class ReverseString {
    public static void main(String[] args) {
        String srt = "Dulanjaya";
        String reverse = "";
        for (int i = srt.length()-1; i >= 0 ; i--) {
            reverse += srt.charAt(i);
        }
        System.out.println(reverse);
//        reverse = new StringBuilder(srt).reverse().toString();
//        System.out.print(reverse);
    }
}
