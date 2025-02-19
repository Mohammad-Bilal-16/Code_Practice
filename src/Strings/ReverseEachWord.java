package Strings;

public class ReverseEachWord {
    public static void main(String[] args) {

        String s = "Hello My Friend";

        String[] a = s.split(" ");

        for(int i = 0 ; i < a.length ; i++){
            String rev = a[i];

            StringBuffer sb = new StringBuffer(rev);
            sb.reverse();
            System.out.print(sb + " ");

        }
    }
}
