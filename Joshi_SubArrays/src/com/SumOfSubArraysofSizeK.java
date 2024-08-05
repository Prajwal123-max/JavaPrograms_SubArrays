/*
 * print all the sum of sub array of size k.
 */
package com;

import java.util.Scanner;

public class SumOfSubArraysofSizeK {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the size of Array:");
		int n=s.nextInt();
		int[] ar=new int[n];
		System.out.println("Enter the Elements;");
		for(int i=0; i<ar.length; i++) {
			ar[i]=s.nextInt();
		}
		System.out.print("Enter the size of k:");
		int k=s.nextInt();
		
		sumOfSubArraySizeK(ar, k);
	}
	public static void sumOfSubArraySizeK(int[] ar,int k) {
		for(int i=0; i<=ar.length-k; i++) {
			int sum=0;
			for(int j=i; j<i+k; j++) {
				sum=sum+ar[j];
			}
			System.out.println(sum);
		}
	}

}
