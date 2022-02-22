package Array;

public class ArrayUtil {
	
	public static void printArray(int [] arr) {
		int len = arr.length;
		for(int ctr = 0 ; ctr < len ; ctr++) {
			System.out.print(arr[ctr] + " ");
		}
		System.out.println(" ");
	}
	
	public void arrayDemo() {
		int[] myarr = new int[5];		// default value
		myarr[0] =10;
		myarr[1] =20;
		myarr[2] =30;
		myarr[3] =40;
		myarr[4] =50;		
		myarr[2] =60;
		myarr[4] =70;
		printArray(myarr);
		System.out.println(myarr.length);
		System.out.println(myarr[myarr.length-2]);
		
		int[] arr = {1,2,3,4,6};
		System.out.println(findMissingNumberInARange(arr));
		printArray(arr);
	}
	
	public int[] resize(int[] arr, int capacity) {
		int[] temp = new int[capacity];
		for(int i = 0 ; i < arr.length ; i++) {
			temp[i] = arr[i];
		}
		arr = temp;
		return arr;
	}
	
	public static int findMissingNumberInARange(int[] arr) {
		int n = arr.length + 1;
		int sum = n * (n + 1) / 2;
		
		for(int num : arr) {
			sum = sum - num;
		}
		return sum;
	}
	public static void main(String[] args) {
		ArrayUtil arrutil = new ArrayUtil();
		arrutil.arrayDemo();
		//printArray(new int[] {10,20,30,40,50});
		//int[] original = new int[] {1,23,4,5,6,7,8};
		//System.out.println("The Size Of The Original Array = " + original.length);
		//original = arrutil.resize(original, 10);
		//System.out.println("The Size Of The Original Array = " + original.length);

	}
}
