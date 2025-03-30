package Java8Features.LambdaExpression.Lambda.Bi_Consumer;

import java.util.function.BiConsumer;

public class Multiplication {
    public static void main(String[] args) {

        BiConsumer<Integer , Integer> mul = (a , b) -> System.out.println(a * b);
        mul.accept(10 , 2);
        mul.accept(3 , 2);

    }
}
