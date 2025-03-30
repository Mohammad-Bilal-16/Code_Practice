package OOPs.Interface;

public interface A {
    void m1();
}
interface B{
    void m2();
}
//class C implements A , B {
interface C extends A , B {
 void m3();
}
class D implements C{
    @Override
    public void m1() {
        System.out.println("Interface A m1()...");
    }

    @Override
    public void m2() {
        System.out.println("Interface B m2()...");
    }

    @Override
    public void m3() {
        System.out.println("Interface C m3()...");
    }


//    @Override
//    public void m1() {
//        System.out.println("Interface A m1()...");
//    }
//    @Override
//    public void m2() {
//        System.out.println("Interface B m2()...");
//    }

    public static void main(String[] args) {
        D d =new D();
        d.m1();
        d.m2();
        d.m3();
    }
}
