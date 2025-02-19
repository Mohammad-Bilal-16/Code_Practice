package Strings;

public class NoOfWordInString {
    public static void main(String[] args) {
        String s = "I Love  Programming";

        String [] a = s.split("\\s+");

        System.out.println(a.length);


    }
}
