package Java8Features.LambdaExpression.Lambda.Function;

import java.util.function.Function;

public class FirstChar {
    public static void main(String[] args) {
        Function<String , Character> f = s -> s.charAt(0);
        System.out.println(f.apply("Bilal"));
        System.out.println(f.apply("Alex"));
    }
}
