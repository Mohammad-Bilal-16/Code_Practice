package Java8Features.LambdaExpression.Lambda.Bi_Predicate;

import java.util.function.BiPredicate;

public class SalaryRange {
    public static void main(String[] args) {
        BiPredicate<String , Integer> bp = (EmployeeName , salary) -> salary >= 10000 && salary <= 50000;
        System.out.println(bp.test("Bilal" , 9000));
        System.out.println(bp.test("Max" , 45000));
    }
}
