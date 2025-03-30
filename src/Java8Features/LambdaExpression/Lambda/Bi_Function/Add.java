package Java8Features.LambdaExpression.Lambda.Bi_Function;

import java.util.function.BiFunction;

public class Add {
    public static void main(String[] args) {
        BiFunction<Integer , Integer , Integer> add = (a , b) -> a + b;
        System.out.println(add.apply(10 , 10));
        System.out.println(add.apply(20 , 20));
    }
}
