package Java8Features.LambdaExpression.Lambda;
interface MaxNumber{
    int getMax(int a , int b);
}
public class LambdaMaxNumber {
    public static void main(String[] args) {
        MaxNumber mn = (i , j) -> i > j ? i : j;
        System.out.println(mn.getMax(10,20));
        System.out.println(mn.getMax(100,20));
    }
}
