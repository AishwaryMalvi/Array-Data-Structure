package Array;

public class MergeSortedArray {
	public static void printArray(int [] arr) {
		int len = arr.length;
		for(int ctr = 0 ; ctr < len ; ctr++) {
			System.out.print(arr[ctr] + " ");
		}
		System.out.println(" ");
	}
	public static int[] merge(int[] arr1,int[] arr2, int n ,int m) {
		int[] result = new int[n+m];
		int i=0,j=0,k=0;
		while(i<n && j<m) {
			if(arr1[i] <arr2[j]) {
				result[k] = arr1[i];
				i++;
			}
			else{
				result[k] = arr2[i];
				j++;
			}
			k++;
		}
		while(i<n) {
			result[k] = arr1[i];
			i++;
			k++;
		}
		while(j<n) {
			result[k] = arr2[j];
			j++;
			k++;
		}
		return result;
		
	}
	public static void main(String[] args) {
		int[] arr1 = new int[] {2,4,6,8,10};
		int[] arr2 = new int[] {1,3,5,7,9};
		MergeSortedArray.printArray(arr1);
		MergeSortedArray.printArray(arr2);
		int[] result = MergeSortedArray.merge(arr1, arr2, arr1.length, arr2.length);
		MergeSortedArray.printArray(result);
	}
}
