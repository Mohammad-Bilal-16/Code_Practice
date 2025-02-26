package Methods;

public class MaxElement {
    public static void main(String[] args) {
        MaxElement obj = new MaxElement();
        int [] a = {1, 3, 78, 8 , 3};
        int max = obj.findMax(a);
        System.out.println(max);
    }
    int findMax(int []a ){
        int max = a[0];
        for(int i = 0 ; i < a.length ; i++){
            if(a[i] > max){
                max= a[i];
            }
        }
        return max;

    }
}
