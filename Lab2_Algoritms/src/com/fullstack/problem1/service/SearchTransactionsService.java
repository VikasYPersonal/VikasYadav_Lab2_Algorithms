package com.fullstack.problem1.service;

import java.util.Scanner;

import com.fullstack.problem1.interfaces.ISearchTransactions;

public class SearchTransactionsService implements ISearchTransactions {
	
	static Scanner scanner = new Scanner(System.in);

	@Override
	public void search(int[] transactionArray, int targetValue) {
		// TODO Auto-generated method stub
				
		long sumValue = 0;

		for(int j = 0; j <= transactionArray.length-1 ; j++) {
			
			sumValue += transactionArray[j];
			//System.out.println("Iteration: " + j + "sumValue: " + sumValue);

			if(sumValue >= targetValue) {
				System.out.println("Target achieved after "+ ++j + " transactions ");
				break;
			}else {					
				if(j == transactionArray.length-1) {
					System.out.println("Given target is not achieved");
				}					
			}
		}

	}

}
