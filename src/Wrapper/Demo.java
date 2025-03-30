package Wrapper;

public class Demo {
    public static void main(String[] args) {
        int i = 10;

        Integer i1 = new Integer(i); // Auto boxing
        System.out.println(i1);

        int j = i1; //Auto Unboxing
        System.out.println(j);
    }
}
