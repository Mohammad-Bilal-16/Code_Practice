package Array;

class MaxElement{
	public static void main(String... args){


	int []a = {14, 13, 2, 7, 3};
	
	int max = a[0];

	for(int i = 0 ; i < a.length ; i++){

	if(a[i] > max){
System.out.println(a[i]);

	
	max = a[i];
	

}
}

System.out.println("max -> " + max);






	}
}