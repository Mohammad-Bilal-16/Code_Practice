package Strings;

public class CountChar {
    public static void main(String[] args) {

        String s = "java";
        char c = 'a';
        int count = 0;

        /**
         * With using toCharArray() method
         */

//        char[] a = s.toCharArray();
//
//
//        for(int i = 0 ; i < a.length ; i++){
//            if(a[i]) == c{
//                count++;
//            }
//        }
//        System.out.println(count);


        /**
         * With using charAt() method
         */

        for (int i = 0 ; i < s.length() ; i++){
            if (s.charAt(i) == c){
                count++;
            }
        }
        System.out.println(count);
    }
}
