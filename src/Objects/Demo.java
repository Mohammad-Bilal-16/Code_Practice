package Objects;

public class Demo {
    public static void main(String[] args) {
        Demo demo =  new Demo();
        Persons person = demo.get();
        System.out.println(person.id + " " + person.name);
    }

    Persons get(){
        Persons person = new Persons();
        person.id = 10;
        person.name = "Bilal";

        return person;
    }
}
class Person{
    int id;
    String name;
}
