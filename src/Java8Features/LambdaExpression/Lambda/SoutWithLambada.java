package Java8Features.LambdaExpression.Lambda;
@FunctionalInterface
interface LambdaDemo{
    void read();
}
public class SoutWithLambada {
    public static void main(String[] args) {
        LambdaDemo ld = () -> {
            System.out.println("Lambda expression invoked!!!");
        };
        ld.read();
    }
}
