package Java8Features.LambdaExpression.Lambda.Function;

import java.util.function.Function;

public class UpperCase {
    public static void main(String[] args) {
        Function<String , String> f = s -> s.toUpperCase();
        System.out.println(f.apply("Hello"));
        System.out.println(f.apply("Hiii"));
    }
}
