package Java8Features.Default_Static_Interfaces.Static_Default;

public class StaticDefaultSubClass implements IStaticDefault {

    /**
     * Overriding the default method from the interface.
     * Default methods can be overridden in implementing classes.
     */
    @Override
    public void testDefault() {
        System.out.println("Overridden testDefault() method...");
    }

    /**
     * Error: Static methods cannot be overridden, only hidden.
     * The following method would cause a compilation error if @Override is used.
     * Uncommenting the @Override annotation will result in:
     * "method does not override or implement a method from a supertype"
     */
//    @Override
//    public static void testStatic() {
//        System.out.println("In static testStatic() method...");
//    }

    /**
     * Static method in subclass: This does NOT override the interface's static method.
     * It is simply a new static method that belongs to this class.
     */
    public static void testStatic() {
        System.out.println("Static method in StaticDefaultSubClass...");
    }

    public static void main(String[] args) {
        StaticDefaultSubClass psc = new StaticDefaultSubClass();
        psc.testDefault(); // Calls overridden default method

        /**
         * 1. Static methods in an interface must be called using the interface name.
         * 2. We can overload static methods inside an interface.
         * 3. We cannot override static methods in an interface, only hide them.
         */
        IStaticDefault.testStatic(); // Calls interface static method
        IStaticDefault.testStatic("This is an overloaded static method inside an interface...");

        // Calls static method of this class, NOT the interface
        StaticDefaultSubClass.testStatic();
    }
}
