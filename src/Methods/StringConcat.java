package Methods;

public class StringConcat {
    public static void main(String[] args) {

        String s1 = "Hello";
        String s2 = "World!!";

        String valueOfConcat = StringConcat.stringConcat(s1, s2);
        System.out.println(valueOfConcat);
    }
    static String stringConcat(String s1 , String s2){

        String concatData = s1.concat(s2);
        return concatData;
    }
}

