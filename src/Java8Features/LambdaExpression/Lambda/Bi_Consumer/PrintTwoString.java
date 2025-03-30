package Java8Features.LambdaExpression.Lambda.Bi_Consumer;

import java.util.function.BiConsumer;

public class PrintTwoString {
    public static void main(String[] args) {

        BiConsumer<String , String> print = (s1 , s2) -> System.out.println(s1 + " " + s2);
        print.accept("hi" , "How are you");
    }
}
