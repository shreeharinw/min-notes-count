package com.greatlearning.services;

public class TransactionServiceImpl {
	
	public void search(int arr[], long target) {
		System.out.println("Search to be done");
		//long sum=0
		//int flag=0.. or boolean flag
//		arr.length
		//for... i=0 ...i<size
//			sum+=arr[i]
//			if sum>=target
//				target acheived
//				flag=1
		//flag==0
			//target not achieved
		long sum=0;
		boolean flag=true;

		//... 100
		
		// 100*arr.length
		
		//arr.length
		for (int i = 0; i < arr.length; i++) { //linear iteration , linear searching
			sum += arr[i];//1
			if (sum >= target) {//0.5
				System.out.println("Target achieved after "+(i + 1) + " transactions ");
				flag = false;
				break;
			}

		}
		if (flag) {
			System.out.println(" Given target is not achieved ");
		}
	}
	
	public void search2(int arr[]) {
		// 1 2 4
		//100
//		int i = 0;
//		while(targetVal > 0 && i<arr.length) {
//			targetVal =  targetVal - arr[i];
//			i++;
//		}
//		if tagretVal <= 0 
			//target achieved
//		else
//			target not achieved
		
		
//		we'll need to put array length check for negative case
//		while(targetVal > 0 && search < arr.length) {
//			targetVal =  targetVal - arr[search];
//			search ++;
//		}
//		if(targetVal > 0) {
//			System.out.println("no of target transaction not achieved");
//		}else {
//		System.out.println("no of target transaction is:" + search);
//		}
	}
	
	public void search3(int arr[], int target) {
//		long sum=0;
//		boolean flag=true;
////		int cs[] = new int[arr.length];
//		// 20 12 31
//		// 20 32 63
//		for (int i = 0; i < arr.length; i++) { //linear iteration , linear searching
//			cs[i] += arr[i];
//		}
//		
//		// 21
//		
//		for (int i = 0; i < cs.length; i++) { //linear iteration , linear searching
//			if (cs[i] >= target) {
//				System.out.println("Target achieved after "+(i + 1) + " transactions ");
//				flag = false;
//				break;
//			}
//
//		}
		long startTime = System.currentTimeMillis();
//		....
		long endTime = System.currentTimeMillis();
	}
	
	
}
