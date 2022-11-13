package com.focus.test;

import java.util.Scanner;

public class FirstApp {

	public static void main(String[] args) {
		/*
		 * int[] a = {10,20,30,40}; for(int elem : a) { System.out.println(elem); }
		 * 
		 * String name = "sachin"; int count = name.toUpperCase().length();
		 * System.out.println("The length of the String is:"+count);
		 * 
		 * StringBuffer sb = new StringBuffer("viratkohli"); int length =
		 * sb.append("INDRCB").reverse().length(); System.out.println(length);
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter elements size of an array");
		int n = scan.nextInt();
		int arr[] = new int[n];

		System.out.println("Enter array elements:");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scan.nextInt();
		}

		for (int i = 0; i < arr.length - 1; i++) {
			int index = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[index]) {
					//System.out.println(arr[j] +" < "+ arr[index]+" ");
					index = j;// searching for lowest index
					System.out.println(index+" ");
				}
			}
			//do swapping elements
			int smallerNumber = arr[index];
			arr[index] = arr[i];
			arr[i] = smallerNumber;
		}

		System.out.println("After Selection Sort");  
        for(int i:arr){  
            System.out.print(i+" ");  
        }  
	}

}
