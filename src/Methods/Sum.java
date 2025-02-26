package Methods;

public class Sum {
    public static void main(String[] args) {
        Sum obj = new Sum();
        int a = 10;
        int b = 20;
        int add = obj.sum(a , b);
        System.out.println(add);
    }
    int sum(int a , int b){
        int c = a + b;
        return c;
    }
}
