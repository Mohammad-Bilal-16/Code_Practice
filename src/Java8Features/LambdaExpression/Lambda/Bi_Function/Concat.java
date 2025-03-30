package Java8Features.LambdaExpression.Lambda.Bi_Function;

import java.util.function.BiFunction;

public class Concat {
    public static void main(String[] args) {
        BiFunction<String , String ,String> concat = (s1 , s2) -> s1 + " " + s2;
        System.out.println(concat.apply("Muhammad" , "Bilal"));
    }
}
