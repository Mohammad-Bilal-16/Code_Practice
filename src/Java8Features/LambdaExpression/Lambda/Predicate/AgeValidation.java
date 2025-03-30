package Java8Features.LambdaExpression.Lambda.Predicate;

import java.util.function.Predicate;

public class AgeValidation {
    public static void main(String[] args) {
        Predicate<Integer> p = age -> age >= 18;
        System.out.println(p.test(10));
        System.out.println(p.test(20));
    }
}
