package Java8Features.LambdaExpression.Lambda;
@FunctionalInterface
interface Addition{
    void sumOfTwoNumbers(int a , int b);
}
public class Sum {
    public static void main(String[] args) {
        /**
         * Multi Line Lambda
         */
        Addition add = (i , j ) -> {
            i = i + j;
            System.out.println(i);
        };
        add.sumOfTwoNumbers(10 , 20);

        /**
         * Single Line lambda...
         */
        Addition add1 = (i , j) -> System.out.println(i + j);
        add1.sumOfTwoNumbers(10 , 10);
    }
}
