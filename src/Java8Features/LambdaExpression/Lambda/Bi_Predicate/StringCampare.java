package Java8Features.LambdaExpression.Lambda.Bi_Predicate;

import java.util.function.BiPredicate;

public class StringCampare {
    public static void main(String[] args) {
        BiPredicate<String , String> bp = (s1 , s2) -> s1.length() == s2.length();
        System.out.println(bp.test("Alice" , "Bob"));
        System.out.println(bp.test("Alice" , "Bilal"));
    }
}
