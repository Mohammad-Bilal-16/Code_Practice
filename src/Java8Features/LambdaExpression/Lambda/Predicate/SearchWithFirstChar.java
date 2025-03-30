package Java8Features.LambdaExpression.Lambda.Predicate;

import java.util.function.Predicate;

public class SearchWithFirstChar {
    public static void main(String[] args) {

        String[] s = {"Ram" , "Shayam", "Rohit", "Akash"};

        Predicate<String> p = i -> i.charAt(0) == 'R';

        for(String str : s){
            if(p.test(str))
            System.out.println(str);
        }
    }
}
