package Methods;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {

        int []arr = {1,2,3,4,5};

        int[] result = reverseArray(arr);

        System.out.println(Arrays.toString(result));

    }
    static int[] reverseArray(int []a){
        for(int i = 0 ; i < a.length / 2 ; i++ ){
            int t = a[i];
            a[i] = a[a.length -1 - i];
            a[a.length - 1 - i] = t;
        }
       return a;
    }
}
