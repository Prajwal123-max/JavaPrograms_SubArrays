/*
 * print all the sub Array of size k.
 */
package com;

import java.util.Scanner;

public class AllSubArraysOfSizeK {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the size of Array:");
		int n=s.nextInt();
		int[] ar=new int[n];
		System.out.println("Enter the Elements:");
		for(int i=0; i<ar.length; i++) {
			ar[i]=s.nextInt();
		}
		System.out.print("Enter the size of k:");
		int k=s.nextInt();
		
		allPosibleSubArrays(ar, k);
	}
	public static void allPosibleSubArrays(int[] ar,int k) {
		for(int i=0; i<=ar.length-k; i++) {
			for(int j=i; j<i+k; j++) {
				System.out.print(ar[j]+" ");
			}
			System.out.println();
		}
	}

}
