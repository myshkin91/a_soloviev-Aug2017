//Alex Soloviev
//10/31/17
import java.util.Arrays;

public class ArraysLab3 {
	
	public static void main (String[] args) {
		int [] a1= {5,10,15,20,25,30,35,40};
		int [] a2= {7,14,21,28,35,42,49,56};
		int [] sumArr = sum(a1,a2);
		int appendNum = 200;
		int [] appendArr = append(a1, appendNum);
		int removeIdx = 5;
		int [] removeArr = remove(a2, removeIdx);
		int sumOfEvens = sumEven(appendArr);
		rotateRight(a1);
		
		System.out.println(Arrays.toString(sumArr));
		System.out.println(Arrays.toString(appendArr));
		System.out.println(Arrays.toString(removeArr));
		System.out.println(sumOfEvens);
		System.out.println(Arrays.toString(a1));
		
		
	}
	//This method accepts two arrays of integers arr1 and arr2 and returns an array of integers, in which every element is the sum of the elements at that index for the arrays arr1 and arr2.
	public static int[] sum(int[] arr1, int[] arr2) {
		int[] arrSum = new int[arr1.length];
		for(int i = 0; i <= arrSum.length-1; i++) {
			arrSum[i] = arr1[i] + arr2[i];
		}return arrSum;
	}
	//This method an array of integer arr and an integer num and returns an array of integers with num added at the end.
	public static int[] append(int[] arr, int num) {
		int[] arrPlusNum = new int [arr.length + 1];
		for(int i = 0; i <= arr.length -1; i++) {
			arrPlusNum[i] = arr[i];
		}
		arrPlusNum[arr.length + 1] = num;
		return arrPlusNum;
	}
	//This method an array of integers arr and an integer idx and returns an array of integers consisting of all of the elements of arr.
	public static int[] remove(int[] arr, int idx) {
		int[] arrMinusIdx = new int[arr.length-1];
		for( int i =0; i<=arr.length-2; i++) {
			while(arrMinusIdx[i] != idx) {
				arrMinusIdx[i] = arr[i];
			}
			
		}return arrMinusIdx;
	}
	//This method accepts an array of integers arr and returns the sum.
	public static int sumEven(int[] arr) {
		int sum = 0;
		for(int i = 0; i <= arr.length-1; i+=2) {
			sum += arr[i];
		}return sum;
	}
	// This method accepts an array of integers arr and shifts the values in the array.
	public static void rotateRight(int[] arr) {
		int last = arr[arr.length-1];
		for( int i = arr.length-1; i >=1; i--) {
			arr[i] = arr[i-1];
		}
		arr[0]=last;
	}

}
