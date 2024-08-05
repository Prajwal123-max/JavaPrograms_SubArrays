/*
 * find the smallest sub array in a given array whose sum is equal to specified value k.
 */
package com;

import java.util.Scanner;

public class SmallestSubArrayWithSumEqualToK {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the size of Array:");
		int n=s.nextInt();
		int[] ar=new int[n];
		System.out.println("Enter the Elements:");
		for(int i=0; i<ar.length; i++) {
			ar[i]=s.nextInt();
		}
		System.out.print("Enter the vlaue k: ");
		int k=s.nextInt();
		
		smallestSubArrayWithSumEqualToK(ar, k);
	}
	public static void smallestSubArrayWithSumEqualToK(int[] ar,int k) {
		boolean found=false;
		for(int size=1; size<=ar.length; size++) {
			for(int i=0; i<=ar.length-size; i++) {
				int sum=0;
				for(int j=i; j<i+size; j++) {
					sum=sum+ar[j];
				}
				if(sum==k) {
					found=true;
					for(int j=i; j<i+size; j++) {
						System.out.print(ar[j]+" ");
					}
					return;
				}
			}
		}
		if(!found) {
			System.out.println("Not found");
		}
	}

}
