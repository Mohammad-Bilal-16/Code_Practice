package Java8Features.LambdaExpression.Lambda.Function;

import java.util.function.Function;

public class SquareOfNumber {
    public static void main(String[] args) {
        Function<Integer , Integer> square = sq -> sq * sq;
        System.out.println(square.apply(2));
        System.out.println(square.apply(3));
    }
}
