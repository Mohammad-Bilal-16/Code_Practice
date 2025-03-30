package Java8Features.LambdaExpression.Lambda;

interface StringLength{
    int getLength(String s);
}
public class LambdaStringLength {
    public static void main(String[] args) {

        StringLength sl = str -> str.length();

        System.out.println(sl.getLength("Hello"));
        System.out.println(sl.getLength("I am A good Boy"));
    }
}
