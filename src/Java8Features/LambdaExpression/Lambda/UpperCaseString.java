package Java8Features.LambdaExpression.Lambda;

@FunctionalInterface
interface Convert{
    String upperCaseString(String s);
}
public class UpperCaseString {
    public static void main(String[] args) {

        Convert convert = s -> s.toUpperCase();
        System.out.println(convert.upperCaseString("hello"));
        System.out.println(convert.upperCaseString("Bilal"));

    }
}
