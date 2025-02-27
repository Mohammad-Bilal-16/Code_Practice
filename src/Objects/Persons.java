package Objects;

import java.util.Arrays;

public class Persons {

    Persons[] m2(){

        Persons p1 = new Persons();
        p1.id = 101;
        p1.name = "max";

        Persons p2 = new Persons();
        p2.id = 102;
        p2.name = "Alex";

        Persons p3 = new Persons();
        p3.id = 103;
        p3.name = "Bilal";

        Persons[] a = {p1, p2 , p3};

        return a;
    }

    int id;
    String name;

    void m1(Persons p1 , Persons p2){
        System.out.println(p1.id + " " + p1.name);
        System.out.println(p2.id + " " + p2.name);
    }

    public static void main(String[] args) {
        Persons p = new Persons();

        Persons p1 = new Persons();
        p1.id = 101;
        p1.name = "Max";

        Persons p2 = new Persons();
        p2.id = 102;
        p2.name = "Alex";

        //p.m1(p1 , p2);

        Persons[] a = p.m2();
        //System.out.println(Arrays.toString(a));

        for(Persons persons : a){
            System.out.println(persons.id + " " + persons.name);
        }
    }
}
