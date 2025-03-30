package Java8Features.LambdaExpression.Lambda.Supplier;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.function.Supplier;

public class CurrentTime {
    public static void main(String[] args) {
        Supplier<LocalTime> time = () ->  LocalTime.now();
        System.out.println(time.get());

        Supplier<LocalDateTime> ldt = () -> LocalDateTime.now();
        System.out.println(ldt.get());
    }
}
