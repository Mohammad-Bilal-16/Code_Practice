package Objects;
public class PrintStudent {
    void print(Student s){
        System.out.println("id : " + s.id);
        System.out.println("name : " + s.name);
    }
    public static void main(String[] args) {
        Student  s = new Student();
        s.id = 100;
        s.name = "Bilal";

        PrintStudent p = new PrintStudent();
        p.print(s);
        //System.out.println(sObj.id + " " + sObj.name);
    }
}
class Student{
    int id;
    String name;
}
