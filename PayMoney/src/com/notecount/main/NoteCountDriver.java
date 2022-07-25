package com.notecount.main;

import java.util.Scanner;

import com.notecount.service.MergeSortImplementation;
import com.notecount.service.NoteCount;

public class NoteCountDriver {
	
	public static void main(String[]args) {
		

	
	MergeSortImplementation mergeSortImplementation = new MergeSortImplementation();
	NoteCount notesCount = new NoteCount();
	
	System.out.println("Enter the size of currency denominations ");
	Scanner sc = new Scanner (System.in);
	int size = sc.nextInt();
	int [] notes = new int[size];
	System.out.println("Enter the currency denominations value ");
	for(int i = 0; i < size; i++) {
		notes[i] = sc.nextInt();
	}
	System.out.println("Enter the amount you want to pay ");
	int amount = sc.nextInt();
	mergeSortImplementation.sort(notes,0,notes.length-1);
	notesCount.notesCountImplementation(notes, amount);
	sc.close();
}

}