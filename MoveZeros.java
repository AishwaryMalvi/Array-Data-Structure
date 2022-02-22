package Array;

public class MoveZeros {
	
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
		//printArray(myarr);
		//System.out.println(myarr.length);
		//System.out.println(myarr[myarr.length-2]);
		
		int[] arr = {1,0,3,5,0,8};
		printArray(arr);
		moveZeroes(arr, arr.length);
		printArray(arr);
	}
	
	public static void moveZeroes(int[] arr, int n) {
		int ctr1 = 0;
		for(int ctr = 0 ; ctr < n ; ctr++) {
			if(arr[ctr] != 0 && arr[ctr1] == 0 ) {
				int temp = arr[ctr];
				arr[ctr] = arr[ctr1];
				arr[ctr1] = temp;
			}
			if(arr[ctr1] != 0) {
				ctr1++;
			}
		}
	}
	
	public static void main(String[] args) {
		
		MoveZeros arrutil = new MoveZeros();
		arrutil.arrayDemo();
	}

}
