package Methods;

import java.util.Arrays;

public class PrintArray {
    public static void main(String[] args) {
        PrintArray pa = new PrintArray();
        int [] a = {1, 2, 3, 4, 5};
        pa.print(a);

    }

    void print(int a[]){
        String s = Arrays.toString(a);
        System.out.println(s);
    }
}
