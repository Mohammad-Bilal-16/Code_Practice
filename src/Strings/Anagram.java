package Strings;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {

        String s1 = "keep";
        String s2 = "peek";

        char []c1 = s1.toCharArray();
        char []c2 = s2.toCharArray();

        Arrays.sort(c1);
        Arrays.sort(c2);

        System.out.println(Arrays.equals(c1 , c2));

    }
}
