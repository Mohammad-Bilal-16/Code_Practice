package Java8Features.LambdaExpression.Lambda.Predicate;

import java.util.function.Predicate;

public class PositiveNumberCheck {
    public static void main(String[] args) {
        Predicate<Integer> p = num -> num > 0;
        System.out.println(p.test(1));
        System.out.println(p.test(-1));
    }
}
