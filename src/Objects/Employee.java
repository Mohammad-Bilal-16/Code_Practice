package Objects;

public class Employee {

    void print(Employer e){
        e.id = 101;
        e.name = "Bilal";

        System.out.println(e.id + " " + e.name);
    }
    public static void main(String[] args) {
        Employer employer = new Employer();

        Employee employee = new Employee();

        employee.print(employer);

    }
}
class Employer{
    int id;
    String name;
}
