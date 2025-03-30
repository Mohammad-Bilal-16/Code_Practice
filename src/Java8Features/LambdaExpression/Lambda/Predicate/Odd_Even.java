package Java8Features.LambdaExpression.Lambda.Predicate;

import java.util.function.Predicate;

public class Odd_Even {
    public static void main(String[] args) {

        Predicate<Integer> p = num -> num % 2 == 0;
        System.out.println(p.test(10));
        System.out.println(p.test(3));
    }
}
