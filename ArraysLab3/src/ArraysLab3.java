
public class ArraysLab3 {
	//This method accepts two arrays of integers arr1 and arr2 and returns an array of integers, in which every element is the sum of the elements at that index for the arrays arr1 and arr2.
	public static int[] sum(int[] arr1, int[] arr2) {
		int[] arrSum = new int[arr1.length];
		for(int i = 0; i <= arrSum.length-1; i++) {
			arrSum[i] = arr1[i] + arr2[i];
		}return arrSum;
	}
	
	public static int[] append(int[] arr, int num) {
		int[] arrPlusNum = new int [arr.length + 1];
		for(int i = 0; i <= arr.length -1; i++) {
			arrPlusNum[i] = arr[i];
		}
		arrPlusNum[arr.length + 1] = num;
		return arrPlusNum;
	}
	
	public static int[] remove(int[] arr, int idx) {
		int[] arrMinusIdx = new int[arr.length-1];
		for( int i =0; i<=arr.length-2; i++) {
			while(arrMinusIdx[i] != idx) {
				arrMinusIdx[i] = arr[i];
			}
			
		}return arrMinusIdx;
	}
	
	public static int sumEven(int[] arr) {
		int sum = 0;
		for(int i = 0; i <= arr.length-1; i+=2) {
			sum += arr[i];
		}return sum;
	}
	
	public static void rotateRight(int[] arr) {
		int last = arr[arr.length-1];
		for( int i = arr.length-1; i >=1; i--) {
			arr[i] = arr[i-1];
		}
		arr[0]=last;
	}

}
