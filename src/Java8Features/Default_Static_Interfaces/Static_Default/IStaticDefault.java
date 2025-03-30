package Java8Features.Default_Static_Interfaces.Static_Default;

/**
 * Interface can have abstract, static, and default methods starting from Java 8.
 */
public interface IStaticDefault {

    /**
     * Q. What is a DEFAULT method?
     *
     * A. Default methods were introduced in Java 8 to provide backward compatibility.
     *    - Default methods in an interface must have a definition/body.
     *    - They are implicitly public.
     *    - We can override default methods in implementing classes.
     */
    default void testDefault() {
        System.out.println("In default testDefault() method...");
    }

    /**
     * Q. What is a STATIC method?
     *
     * A. Static methods were introduced in Java 8 to provide backward compatibility.
     *    - Static methods in an interface must have a definition/body.
     *    - They are implicitly public (though explicitly mentioning `public` is optional).
     *    - Static methods **cannot be overridden** because they are associated with the interface itself, not instances.
     *    - Unlike instance methods, static methods are resolved at **compile-time**, whereas overridden methods are resolved at **runtime** (runtime polymorphism).
     *    - Static methods belong to the interface, so they must be called using the **interface name** (`InterfaceName.methodName()`).
     *    - We **can overload static methods** in an interface.
     */

    static void testStatic() {
        System.out.println("In static testStatic() method...");
    }

    static void testStatic(String s) {
        System.out.println(s);
    }
    /**
     * CONCLUSION:
     *  - An interface can have concrete methods, but they must be either `default` or `static` (since Java 8).
     *  - We can define multiple `static` and `default` methods in an interface.
     *  - Static methods **can be overloaded** but **cannot be overridden**.
     */
}
