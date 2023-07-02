package com.greatlearning.driver;

import java.util.Scanner;

import com.greatlearning.services.BubbleSortImpl;
import com.greatlearning.services.NotesCount;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the size of currency denominations ");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] notes = new int[size];
		System.out.println("enter the currency denominations value");
		for (int i = 0; i < size; i++) {
			notes[i] = sc.nextInt();
		}
		System.out.println("enter the amount you want to pay");
		int amount = sc.nextInt();
		BubbleSortImpl bubbleSortImpl = new BubbleSortImpl();
		bubbleSortImpl.bubblesort(notes);
		NotesCount notesCount = new NotesCount();
		notesCount.notesCountImpl(notes, amount);
	}

}
