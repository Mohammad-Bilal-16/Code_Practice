package Constructors;

public class Employee {
    int id;     //Instance variable
    String name;    //Instance variable

    Employee(int id , String name) {        //Parameterized Constructor with local variable
        this.id = id;       //Initilizing local variable to instance variable
        this.name = name;   ////Initilizing local variable to instance variable

        System.out.println(this.id + " " + this.name);
    }
    Employee(String name){ //Constructor OverLoading
        this.name = name;
        System.out.println(this.name);
    }

    public static void main(String[] args) {
        Employee e = new Employee(101 , "Bilal");
        Employee e1 = new Employee("Muhammad");

    }

}
