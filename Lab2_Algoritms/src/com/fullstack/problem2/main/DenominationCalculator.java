package com.fullstack.problem2.main;

import java.util.Scanner;
import com.fullstack.problem2.service.SearchDenomiationsService;

public class DenominationCalculator {
	
	static Scanner scanner = new Scanner(System.in);
	static SearchDenomiationsService searchService = new SearchDenomiationsService();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] denominationsArray = getArrayInput();
		
		System.out.println("Enter the amount you want to pay:");

		int amount = scanner.nextInt();
		
		searchService.search(denominationsArray, amount);
	}
	
	public static int[] getArrayInput() {		

		System.out.println("Enter the size of currency denominations: ");
		int array_size = scanner.nextInt();

		int[] denominationsArray = new int[array_size];
		
		System.out.println("enter the currency denominations value:");
		for(int i = 0; i <= array_size-1;i++) {
			denominationsArray[i] = scanner.nextInt();
		}
		
		return denominationsArray;
	}

}
