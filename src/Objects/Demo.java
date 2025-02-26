package Objects;

public class Demo {
    public static void main(String[] args) {
        Demo demo =  new Demo();
        Person person = demo.get();
        System.out.println(person.id + " " + person.name);
    }

    Person get(){
        Person person = new Person();
        person.id = 10;
        person.name = "Bilal";

        return person;
    }
}
class Person{
    int id;
    String name;
}
