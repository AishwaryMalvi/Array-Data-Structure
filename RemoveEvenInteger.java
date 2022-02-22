package Array;

public class RemoveEvenInteger {
	
	public static void printArray(int [] arr) {
		int len = arr.length;
		for(int ctr = 0 ; ctr < len ; ctr++) {
			System.out.print(arr[ctr] + " ");
		}
		System.out.println(" ");
	}
	
	public static int[] removeEven(int[] arr) {
		int oddCount = 0;
		for(int ctr = 0 ; ctr < arr.length ; ctr++) {
			if(arr[ctr] % 2 != 0) {
				oddCount++;
			}
		}
		int[] result = new int[oddCount];
		int idx = 0;
		for(int ctr = 0 ; ctr < arr.length ; ctr++) {
			if(arr[ctr] % 2 != 0) {
				result[idx] = arr[ctr];
				idx++;
			}
		}
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {10,20,30,7,8,5,11};
		printArray(arr);
		int[] result = removeEven(arr);
		printArray(result);

	}

}
