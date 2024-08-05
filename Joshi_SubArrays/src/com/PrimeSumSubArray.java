/*
 * print all the subArrays whose sum is prime number.
 */
package com;

import java.util.Scanner;

public class PrimeSumSubArray {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the size of Array:");
		int n=s.nextInt();
		int[] ar=new int[n];
		System.out.println("Enter the Elements:");
		for(int i=0; i<ar.length; i++) {
			ar[i]=s.nextInt();
		}
		primeSumSubArray(ar);
	}
	public static boolean isPrime(int num) {
		if(num<2) {
			return false;
		}
		for(int i=2; i<=num/2; i++) {
			if(num%i==0) {
				return false;
			}
		}
		return true;
	}
	public static void primeSumSubArray(int[] ar) {
		for(int size=1; size<=ar.length; size++) {
			for(int i=0; i<=ar.length-size; i++) {
				int sum=0;
				for(int j=i; j<i+size; j++) {
					sum=sum+ar[j];
				}
				if(isPrime(sum)) {
					for(int j=i; j<i+size; j++) {
						System.out.print(ar[j]+" ");
					}
					System.out.println();
				}
			}
		}
	}

}
