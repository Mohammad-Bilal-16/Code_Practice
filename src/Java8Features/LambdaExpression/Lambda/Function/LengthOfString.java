package Java8Features.LambdaExpression.Lambda.Function;

import java.util.function.Function;

public class LengthOfString {
    public static void main(String[] args) {
        Function<String , Integer> length = str -> str.length();
        System.out.println(length.apply("Bilal"));
        System.out.println(length.apply("Muhammad"));
    }
}
