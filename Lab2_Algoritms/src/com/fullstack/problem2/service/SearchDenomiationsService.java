package com.fullstack.problem2.service;

import com.fullstack.problem2.interfaces.ISearchDenominations;

public class SearchDenomiationsService implements ISearchDenominations {

	@Override
	public void search(int[] denominationsArray, int amount) {
		// TODO Auto-generated method stub
		
		denominationsArray = sort(denominationsArray);
				
		int division, reminder= 0;
		System.out.println("Your payment approach in order to give min no of notes will be:");
		for(int i=0;i<denominationsArray.length;i++) {
			division = amount / denominationsArray[i];
			reminder = amount % denominationsArray[i];
			
			if(division != 0 && reminder < denominationsArray[i]) {
				System.out.println(denominationsArray[i] + ":" + division);
				amount = reminder;
			}
		}
	}

	@Override
	public int[] sort(int[] denominationsArray) {
		// TODO Auto-generated method stub

		//outer loop to iterate over each element the input array
		for(int i=denominationsArray.length-1; i>0;i--) {
			//inner loop to iterate, compare and exchange a pair of values in the array.
			for(int j=0;j<i;j++) { 
				//compare two consecutive values
				if(denominationsArray[j]<denominationsArray[j+1]) { 
					int temp = denominationsArray[j]; //swap values
					denominationsArray[j] = denominationsArray[j+1];
					denominationsArray[j+1]=temp;
				}
			}
		}
		
		return denominationsArray;

	}

}
