package Strings;

public class ValueOfMethod {
    public static void main(String[] args) {
        int a = 10;
        int b = 10;

        System.out.println("a + b : " + (a + b));

        String c = String.valueOf(a) + String.valueOf(b);
        System.out.println("valueOf a + b : " + c);

    }
}
