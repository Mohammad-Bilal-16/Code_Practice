package methods;
public class StaticMethodCall {
    static int m1 (){
        int i = 10;
        return i;
    }
    public static void main(String[] args) {

        int num = StaticMethodCall.m1();
        System.out.println(num);

        System.out.println(m1());
    }
}
