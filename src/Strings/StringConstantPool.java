package Strings;

public class StringConstantPool {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "Hello";

        if(s1 == s2){
            System.out.println("Both String literals are same");
        }else{
            System.out.println("Both String literals are not same");
        }

        String s3 = new String("hii");
        String s4 =  new String("hii");

        if(s3 == s4){
            System.out.println("Both String Object are same");
        }else{
            System.out.println("Both String Object are not same");
        }

    }
}
