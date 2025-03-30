package Java8Features.LambdaExpression.Lambda.Bi_Predicate;

import java.util.function.BiPredicate;
public class StudentMarks {
    public static void main(String[] args) {
        BiPredicate<String , Integer> bp = (name , marks) -> marks >= 50;

        System.out.println(bp.test("Alice" , 51));
        System.out.println(bp.test("Bilal" , 33));
    }
}
