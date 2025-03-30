package Java8Features.LambdaExpression.Lambda.Bi_Function;

import java.util.function.BiFunction;

public class Multiply {
    public static void main(String[] args) {

        BiFunction<Integer , Integer, Integer> mul = (i  , j) -> i * j;
        System.out.println(mul.apply(10 , 2));
        System.out.println(mul.apply(3 , 2));
    }
}
