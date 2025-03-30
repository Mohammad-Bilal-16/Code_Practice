package Java8Features.LambdaExpression.Lambda.Consumer;

import java.util.function.Consumer;

public class UpperCaseStrConversion {
    public static void main(String[] args) {
        Consumer<String> convert = s -> System.out.println(s.toUpperCase());
        convert.accept("Hello");
        convert.accept("Hiiiii");
    }
}
