public class PairsSumEight {
    public static void main(String[] args) {

        int []a = {3, 5, 1, 6, 2 ,7, 9};

        int sum =8;

        for(int i = 0 ; i < a.length ; i++){
            for(int j = i + 1 ; j < a.length ; j++){

                if(a[i] + a[j] == sum){
                    System.out.println(a[i] + " + " + a[j] + " = " + sum);
                }
            }
        }
    }
}
