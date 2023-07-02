package com.greatlearning.services;

public class NotesCount {
	
	public void notesCountImpl(int notes[], int amount) {
		int[] noteCounter = new int[notes.length];
		// 10, 52, 89, 1..user input
		// 89, 52, 10, 1..notes
		// 900
		// Currency:count
		// 900/89 = 10...... 89:10.... 890
		// Left with 10
		// 10/10...1 ....10:1...10 
		// 10-10..0... Happy case... 
		
//		 89:10
//		 10:1
		 
		// 5 1 10...user input
		// 10 5 1..notes
		// 12..amount
		// amount/notes[i]... 
		//Currency:count
		// 12/10...1.2...round off 1... 10:1... 10
		//Left with 12-10=2
		//2/5... 0.4... round off 0...not possible..overpaying
		// 2/1...2 round off 2... 1:2...2
		// 2-2=0...happy case amound paid
		// 10:1
		// 1:2
		
		// 5 2 10...user input
		// 10 5 2..notes
		// 13..amount
		// amount/notes[i]... 
		// Currency:count
		// 13/10...1.3...round off 1... 10:1... 10
		//Left with 13-currency*count=3
		//3/5... 0.6... round off 0...not possible..overpaying
		// 3/2...1.5 round off 1... 2:1...2
		// 3-2=1...left with 1
		// Cannot pay the amount with highest denomination
		
//		10 5 2
//		1 0 1
		
		//int noteCounter = new int[notes.length]
		// try{}catch block...why?...division operation...ArithmeticExpection... e
			// for 0 .. notes.length
				// if amount>=notes[i].... amount has to be higher than current denomination i.e notes[i]
					//noteCounter[i] = amount/notes[i]
					//amount = amount - noteCounter[i]*notes[i]
	//				else
	//					noteCounter[i]=0
			// if amount > 0
				// Cannot pay the amount with highest denomination
			// else
				// display the noteCount and notes[i] 
		
		
		//5 2 1
		//2 1 1
		
		// 5 1 2..user input
		// 13
		// 5 2 1
		// 13
		// 13/5 = 2.6... 2 
		// 3
		// 3/2 = 1.5 ...1
		// 1
		
		try {
			for (int i = 0; i < notes.length; i++) {
				if (amount >= notes[i]) {
					noteCounter[i] = amount / notes[i];
					amount = amount - noteCounter[i] * notes[i];
				} 
			}
			if (amount > 0) {
				System.out.println("exact amount cannot be given with the highest denomination");
			} else {
				System.out.println("Your payment approach in order to give min no of notes will be");
				for (int i = 0; i < notes.length; i++) {
					if (noteCounter[i] != 0) {
						System.out.println(notes[i] + ":" + noteCounter[i]);
					}
				}
			}
		} catch (ArithmeticException e) {
			System.out.println(e+ " notes of denomination 0 is invalid");
		}
		
		// 13...5 and 2 cannot be displayed
		// 5:2..coins...
		// 5:1.. and 2:4... 
		
		//... its good introduction to dynamic programming
		//KnapSack... weights... 
	}

}
