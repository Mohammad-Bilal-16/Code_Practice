package Objects;
public class University {
    public static void main(String[] args) {
        //University u = University.m1(101);
        University u = m1(101);
        System.out.println(u.id + " " + u.name);

        //By using Above object u i'm going to call let's create instance method

        String str = u.m2();
        System.out.println(str);
    }

    String m2(){
        String s = "Hello";
        return s;
    }
    int id;
    String name;
    static University m1(int id){
        University u = new University();

        if(id == 101){
            u.id = 101;
            u.name = "Oxford";
        } else if (id == 102) {
            u.id = 102;
            u.name = "Standford";
        }
        return  u;
    }
}


 //   public static void main(String[] args) {
//
//        University university = new University();
//        Collage c = university.get(102);
//        System.out.println(c.id + " " + c.collageName);
//
//    }
//
//    Collage get(int id){
//        Collage collage = new Collage();
//        //collage.id = 3214;
//        //collage.collageName = "RJIT";
//
//        if(id == 101){
//            collage.id = 101;
//            collage.collageName = "IIT Bombay";
//        }else if(id == 102){
//            collage.id = 101;
//            collage.collageName = "IIT delhi";
//        }
//
//        return collage;
//    }
//
//}
//class Collage{
//    int id;
//    String collageName;
