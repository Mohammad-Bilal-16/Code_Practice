package Java8Features.LambdaExpression.Lambda.Consumer;

import java.util.function.Consumer;
public class Print {
    public static void main(String[] args) {
        Consumer<String> s = (str) -> System.out.println(str);
        s.accept("Hello to Funcutional Progarmming!!!");
    }
}
