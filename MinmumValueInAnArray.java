package Array;

public class MinmumValueInAnArray {
	
	public static int findmin(int[] arr) {
		int min = arr[0];
		for(int ctr=1 ; ctr < arr.length ; ctr++) {
			if(arr[ctr] < min) {
				min = arr[ctr];
			}
		}
		return min;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {10,20,30,40,0,50};
		int value = findmin(arr);
		System.out.println("The Minimum Value Of The Array Is = " + value);
	}

}
