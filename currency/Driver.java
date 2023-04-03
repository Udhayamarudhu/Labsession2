package com.greatlearning.currency;
import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		IntegerSorting sorting =new MergeSort();
		NotesCount counting =new NotesCount();
		System.out.println("Enter the size of the currency denomination ");
		int size=in.nextInt();
		int[] denominations= new int[size];
		System.out.println("Enter the currency denomination value ");
		for(int i=0;i<size;i++) {
			denominations[i]=in.nextInt();
		}
		sorting.sort(denominations);
		System.out.println("Enter the amount you want to pay");
		int amount=in.nextInt();
		
		counting.calculateNotesCount(denominations, amount);

	}

}
