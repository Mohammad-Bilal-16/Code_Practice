package Java8Features.LambdaExpression.Lambda.Predicate;

import java.util.function.Predicate;

public class PredicateDemo {
    public static void main(String[] args) {

        /**
         * Predicate is a functional interface.
         * The abstract method in Predicate is test().
         * It takes an one input and returns a boolean (true or false).
         * It is typically used for conditional checks, similar to an if-else statement.
         *
         * Predicate also provides three default methods:
         *  1. negate() - Reverses the result of the predicate.
         *  2. and() - Combines two predicates using logical AND.
         *  3. or() - Combines two predicates using logical OR.
         */
        Predicate<Integer> p = (num) -> num != 100;

        System.out.println(p.test(100));
    }
}
