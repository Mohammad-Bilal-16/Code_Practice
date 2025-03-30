package Java8Features.LambdaExpression.Lambda.Bi_Function;

import java.util.function.BiFunction;

public class FindMax {
    public static void main(String[] args) {
        BiFunction<Integer, Integer ,Integer> fm = (a , b) -> a > b ? a : b;
        System.out.println(fm.apply(10, 2));
        System.out.println(fm.apply(1, 2));
    }
}
