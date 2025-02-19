package Strings;

public class Reverse {
    public static void main(String[] args) {
        String s = "elephant";

        String rev = "";

        for(int i = s.length() - 1 ; i >= 0 ; i--){
            rev = rev + s.charAt(i);
        }
        System.out.println(rev);

//        StringBuffer sb = new StringBuffer(s);
//
//        sb.reverse();
//
//        System.out.println(sb);
    }
}
