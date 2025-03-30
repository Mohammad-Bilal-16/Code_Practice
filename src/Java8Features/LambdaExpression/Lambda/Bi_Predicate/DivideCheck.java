package Java8Features.LambdaExpression.Lambda.Bi_Predicate;

import java.util.function.BiPredicate;
public class DivideCheck {
    public static void main(String[] args) {

        BiPredicate<Integer , Integer> bp = (num , divisor) -> num % divisor == 0;
        System.out.println(bp.test(10 , 2));
        System.out.println(bp.test(10 , 3));
    }
}
