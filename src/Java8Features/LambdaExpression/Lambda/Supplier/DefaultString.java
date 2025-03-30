package Java8Features.LambdaExpression.Lambda.Supplier;

import java.util.function.Supplier;

public class DefaultString {
    public static void main(String[] args) {
        Supplier<String> s = () -> "Welcome to functional Programming!!!";
        System.out.println(s.get());
    }
}
