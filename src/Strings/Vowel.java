package Strings;

public class Vowel {
    public static void main(String[] args) {

        String s = "I love my Country";

        s = s.replaceAll("[aeiouAEIOU]","");
        System.out.println(s);
    }
}
