package Java8Features.LambdaExpression;
@FunctionalInterface
public interface Demo {

    void hello();

    public default void add(int a  , int b ){
        int c = a + b;
        System.out.println(c);
    }
}
class LambdaChild {
//    public static void main(String[] args) {
//
//        Demo d = (a , b) -> System.out.println(a +" " +" "+ b);
//
//        d.add(10, 20);
//    }
//}
}
