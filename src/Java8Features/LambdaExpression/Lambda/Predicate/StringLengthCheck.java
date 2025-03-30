package Java8Features.LambdaExpression.Lambda.Predicate;

import java.util.function.Predicate;

public class StringLengthCheck {
    public static void main(String[] args) {

        Predicate<String> p = name -> name.length() >= 5;
        System.out.println(p.test("Max"));
        System.out.println(p.test("Bilal"));
    }
}
