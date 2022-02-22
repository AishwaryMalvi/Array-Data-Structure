//revesing the array
package Array;

//importing the java.util package
import java.util.*;
public class ReverseArray {
	//pringing an array function
	public static void printArray(int [] arr) {
		int len = arr.length;
		
		for(int ctr = 0 ; ctr < len ; ctr++) {
			System.out.print(arr[ctr] + " ");
		}
		System.out.println(" ");
	}
	
	public static void reverse(int[] number, int start, int end) {
		while(start<end) {
			int temp = number[start];
			number[start] = number[end];
			number[end] = temp;
			start++;
			end--;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Size");
		int size = scanner.nextInt();
		
		int[] arr = new int[size];
		
		System.out.println("Enter the Element");
		for(int ctr=0 ; ctr < size;ctr++) {
			arr[ctr] = scanner.nextInt();
		}
		
		System.out.println("Original Array - ");
		printArray(arr);
		reverse(arr,0,arr.length-1);
		System.out.println("Reverse Array - ");
		printArray(arr);

	}
}
