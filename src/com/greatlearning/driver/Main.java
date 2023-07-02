package com.greatlearning.driver;

import java.util.Scanner;

import com.greatlearning.services.TransactionServiceImpl;

public class Main {

	static Scanner s = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the size of transaction array");
		TransactionServiceImpl transactionServiceImpl = new TransactionServiceImpl();
		int size = s.nextInt();

		int arr[] = new int[size];

		System.out.println("enter the values of array");
		
		for (int i = 0; i < size; i++) {
			arr[i] = s.nextInt();
		}
		System.out.println("enter the total no of targets that needs to be achieved");
		int targetNo = s.nextInt();
		
		// while targetNo!==0
			//get the input for target value
			// find out whether target is achieved or not....  call or invoke TransactionServiceImpl.search
			//targetNo--
		while (targetNo--!= 0) {
			long target;
			System.out.println("enter the value of target");
			target = s.nextLong();
			transactionServiceImpl.search(arr,target);
			targetNo--;
		}
	}

}
