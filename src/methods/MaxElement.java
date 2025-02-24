package methods;

public class MaxElement {

    int maxEle(int []a ){

        int max = a[0];

        for(int i = 0 ; i < a.length ; i++){
            if(a[i] > max){
                max= a[i];
            }
        }
        return max;

    }
    public static void main(String[] args) {

        MaxElement obj = new MaxElement();

        int [] a = {1, 3, 78, 8 , 3};

        int max = obj.maxEle(a);
        System.out.println(max);


    }
}
