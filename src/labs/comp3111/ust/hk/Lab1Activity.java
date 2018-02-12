package labs.comp3111.ust.hk;

public class Lab1Activity {
	static int MaxNum(int[] arr1){
		int large=arr1[0];
		for(int i:arr1) {
			if(large<i) {
				large=i;
			}
		}
		
		return large;
	};
	
	static int MinNum(int[] arr1){
		int small=arr1[0];
		for(int i:arr1) {
			if(small>i) {
				small=i;
			}
		}
		
		return small;   //
	}; 
	
	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5,6,7,8,9,10};
		int sum=0;
		for(int i: arr) {
			sum+=i;
		}

		System.out.println(String.format("Sum of the number is %d",sum));
		System.out.println("Min = "+MinNum(arr)+"; "+"Max = "+MaxNum(arr));

	}
}
