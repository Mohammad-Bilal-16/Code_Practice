package Array;

public class Reverse {
    public static void main(String[] args) {
//        int []a = {5,4,3,2,1};
//        int j = 0;
//        int i = 0;
//
//        for(i = 0 , j = a.length-1 ; i < j ; i++ , j--){
//            int t = a[i];
//            a[i] = a[j];
//            a[j] = t;
//        }
//
//        for(int num : a){
//            System.out.print(num + " ");
//        }


        int []a = {5, 4 ,3 ,2 ,1};
        int temp = 0;

        for(int i = 0; i < a.length / 2 ; i++){
           temp = a[i];
           a[i] = a[a.length - 1 - i];
           a[a.length - 1 - i] = temp;
        }
        for(int num : a){
            System.out.print(num + " ");
        }


        /**
         * With new array[]
         */

//        int []a = {5, 4 ,3 ,2 ,1};
//        int []temp = new int[a.length];
//
//        int count = 0;
//
//        for(int i = a.length - 1 ; i >= 0 ; i--){
//            temp[count] = a[i];
//            count++;
//        }
//                for(int num : temp){
//            System.out.print(num + " ");
//        }

        /**
         * False approch
         */

//        int temp = 0;
//
//        for(int i = a.length-1 ; i >= 0 ; i--){
//            a[temp] = a[i];
//            temp++;
//        }
//        for(int num : a){
//            System.out.print(num + " ");
//        }
    }
}
