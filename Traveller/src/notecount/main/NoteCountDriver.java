package notecount.main;

import java.util.Scanner;

import mergeSort.MergeSort;
import notesCountService.NotesCountService;
 
public class NoteCountDriver {
	
	public static void main(String[]args) {
	
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of currency denominations");
		int size = sc.nextInt();
		
		int [] arr = new int [size];
		System.out.println("Enter the currency denominations value");
		
//		System.out.println("Enter the currency denominations value ");
		for(int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		
		MergeSort sort = new MergeSort();
		sort.sort(arr, 0, arr.length-1);
		System.out.println("Enter the amount you want to pay");
		int targetNumbers = sc.nextInt();
		
		
		NotesCountService ncs = new NotesCountService();
		ncs.notesCounter(arr, targetNumbers);
	}

}
