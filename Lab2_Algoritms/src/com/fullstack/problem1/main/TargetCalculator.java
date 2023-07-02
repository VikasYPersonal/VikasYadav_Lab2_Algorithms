package com.fullstack.problem1.main;

import java.util.Scanner;

import com.fullstack.problem1.service.SearchTransactionsService;

public class TargetCalculator {

	static Scanner scanner = new Scanner(System.in);
	
	static SearchTransactionsService searchService = new SearchTransactionsService();

	public static void main(String[] args) {

		int[] transactionArray = getArrayInput();

		System.out.println("Enter the total no of targets that needs to be achieved");

		int totalTransactions = scanner.nextInt();

		for(int i = 0; i <= totalTransactions-1; i++) {
			
			System.out.println("Enter the value of target:");
			int targetValue = scanner.nextInt();
			
			searchService.search(transactionArray, targetValue);
			
		}
	}

	public static int[] getArrayInput() {		

		System.out.println("Enter the size of transaction array");
		int array_size = scanner.nextInt();

		int[] transactionArray = new int[array_size];
		System.out.println("Enter the values of array:");
		for(int i = 0; i <= array_size-1;i++) {
			transactionArray[i] = scanner.nextInt();
		}

		return transactionArray;
	}

}
