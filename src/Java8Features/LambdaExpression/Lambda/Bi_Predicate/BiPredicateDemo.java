package Java8Features.LambdaExpression.Lambda.Bi_Predicate;

import java.util.function.BiPredicate;

public class BiPredicateDemo {

    /**
     * Takes two input and returns boolean value
     */
    public static void main(String[] args) {
        BiPredicate<Integer , Integer> bp = (i , j ) ->  i == j;

        System.out.println( bp.test(10 , 20));
    }
}
