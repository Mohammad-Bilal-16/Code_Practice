package Strings;

import java.sql.SQLOutput;

public class SwapWithoutThirdVariable {
    public static void main(String[] args) {

        String s1 = "Java"; //4
        String s2 = "Program"; //7

         s1 = s1 + s2;  // JavaProgram s1 11

        // substring(0, 11 - 7) = substring(0, 4) = "Java"
        s2  = s1.substring(0, s1.length() - s2.length());

        // s2.length() = 4, s1 = s1.substring(4) = "JavaProgram".substring(4) = "Program"
        s1 = s1.substring(s2.length());

        System.out.println("s1 : " + s1);
        System.out.println("s2 : " + s2);

    }

}
