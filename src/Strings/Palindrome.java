package Strings;

public class Palindrome {
    public static void main(String[] args) {

        String s = "madam";

//        String s1 = s;
        StringBuffer sb = new StringBuffer(s);
        sb.reverse();

        if(sb.toString().equals(s)){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not Palindrome");
        }
    }
}
