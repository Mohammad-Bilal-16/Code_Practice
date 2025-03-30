package OOPs.Abstract;

import OOPs.Interface.A;

public abstract class Parent {
    abstract void m1();

    void m2(){
        System.out.println("Inside Concreate Method!!!");
    }
    Parent(){
        System.out.println("Inside Abstract Class Constructor!!!");
    }
}
class Child extends Parent  {
    @Override
    void m1() {
        System.out.println("Inside abstract methods iml by Child");
    }
    public static void main(String[] args) {
        Child c = new Child();
        c.m1();
        c.m2();
    }
}


