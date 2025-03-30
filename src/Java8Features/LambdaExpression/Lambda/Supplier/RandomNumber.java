package Java8Features.LambdaExpression.Lambda.Supplier;

import java.util.Random;
import java.util.function.Supplier;

public class RandomNumber {
    public static void main(String[] args) {
        Supplier<String> s = () -> {
            String otp = "";
            for(int i = 0 ; i <= 5 ; i++){
                otp += (int) (Math.random()*10);
            }
            return otp;
        };
        System.out.println(s.get());
        System.out.println(s.get());
        System.out.println(s.get());
        System.out.println();

        System.out.println("---------------------------------------------");

        Supplier<Integer> s1 = () -> new Random().nextInt(10000) + 1;
        System.out.println(s1.get());
        System.out.println(s1.get());
        System.out.println(s1.get());
    }
}
