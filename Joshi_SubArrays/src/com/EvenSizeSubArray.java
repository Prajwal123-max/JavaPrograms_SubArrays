/*
 * print all even size sub array.
 */
package com;

import java.util.Scanner;

public class EvenSizeSubArray {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the size of Array:");
		int n=s.nextInt();
		int[] ar=new int[n];
		System.out.println("Enter the Elements:");
		for(int i=0; i<ar.length; i++) {
			ar[i]=s.nextInt();
		}
		evenSizeSubArray(ar);
	}
	public static void evenSizeSubArray(int[] ar) {
		for(int size=2; size<=ar.length; size=size+2) {
			for(int i=0; i<=ar.length-size; i++) {
				for(int j=i; j<i+size; j++) {
					System.out.print(ar[j]+" ");
				}
				System.out.println();
			}
		}
	}

}
