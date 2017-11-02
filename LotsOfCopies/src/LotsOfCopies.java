//Alex Soloviev
//November 1,2017

import java.util.*;
public class LotsOfCopies {
	public static void main(String[] args) {
	int num = 7;
	String strMain = "APCS";
	int[] arrMain = {1, 2, 3, 4, 5};
	changeMe(num, strMain, arrMain);
	System.out.println(num); 
	System.out.println(strMain);
	System.out.println(Arrays.toString(arrMain)); 
	aTob();
	
}

public static void changeMe(int x, String str, int[] arr) {
	x = 8;
	str = "CSAP";
	for (int i = 0; i < arr.length; i++) {
		arr[i] += 1;
	}
}
public static void  aTob() {
	int numA = 1;
	int numB = numA;
	numA += 1;
	System.out.println(numB); 
	String strA = "Hello";
	String strB = strA;
	strA = "Bye!";
	System.out.println(strB); 
	int[] arrA = {3, 6, 9, 12};
	int[] arrB = arrA;
	for (int i = 0; i < arrA.length; i++) {
		arrA[i] = 0;
	} 
	System.out.println(Arrays.toString(arrB));
}
}
