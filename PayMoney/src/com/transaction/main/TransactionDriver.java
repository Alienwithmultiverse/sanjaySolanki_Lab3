package com.transaction.main;

import java.util.Scanner;

import com.transaction.service.TransactionService;

public class TransactionDriver {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("enter the size of transaction array");
		
		int size = s.nextInt();
		
		int arr[] = new int [size];
		
		System.out.println("enter the value of array");
		
		for(int i = 0; i < size; i++) {
			arr[i] = s.nextInt();
		}
		
		System.out.println("enter the total no of targets that needs to be achieved");
		int targetNo = s.nextInt();
		
		TransactionService transactionService = new TransactionService();
		
		transactionService.checkTrancsaction(arr, targetNo);
		
		s.close();
	}

}
