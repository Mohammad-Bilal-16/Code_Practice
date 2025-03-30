package Java8Features.LambdaExpression.Lambda.Consumer;

import java.util.function.Consumer;

public class SquareNumber {
    public static void main(String[] args) {
        Consumer<Integer> squareNumber = (num) -> System.out.println(num * num);
        squareNumber.accept(10);
        squareNumber.accept(5);

    }
}
