package com.greatlearning.labsession2.paymoney;

import java.util.Scanner;

public class TransactionCheck {

	public static void main(String[] args) {
		Scanner in= new Scanner(System.in);
		System.out.println("Enter the size of Transaction array: ");
		int transSize=in.nextInt();
		int[] arr=new int[transSize];
		System.out.println("Enter the value for the array :");
		for(int i=0;i<transSize;i++) {
			arr[i]=in.nextInt();	
		}
		System.out.println("Enter the total no of target to be achived :");
		int targetSize=in.nextInt();
		for(int i=0;i<targetSize;i++) {
			System.out.println("Enter the target value : ");
			int target=in.nextInt();
			int result= getNoOfTransactionsForTarget(arr,target);
			if(result>0) {
				System.out.println("The Target is achived in "+result+" transactions");
			}
			else {
				System.out.println("The target is not achived");
			}
		}
		
		}
	private static int getNoOfTransactionsForTarget(int[] transactions,int target) {
		int sum=0;
		for(int i=0;i<transactions.length;i++)
		{
			sum+=transactions[i];
			if(sum>=target) {
				return i+1;
				
			}
		}
	return -1;
	}
}
