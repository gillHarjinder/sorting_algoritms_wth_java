import java.util.Scanner;
import java.util.*;

public class Algorithm {

	public static void main(String[] args) {
		// Unsorted array
		Integer[] array = new Integer[] {13, 14, 25, 11, 4, 7, 90, 80};
		
		// Length of an array;
		int arrayLength = array.length;
		
		// Entered value from User return
		int userInput = checkEnterValue();
		
		// Switch statement to call algorithms
		switch(userInput)
		{
			case 1:
				SelectionSort sobj = new SelectionSort(array, arrayLength);
				break;
			case 2:
				BubbleSort bobj = new BubbleSort(array, arrayLength);
				break;
			case 3:
				InsertionSort iobj = new InsertionSort(array, arrayLength);
				break;
			case 4:
				QuickSort qobj = new QuickSort(array, arrayLength);
				break;
			case 5:
				MergeSort mobj = new MergeSort(array, arrayLength);
				break;
			case 6:
				HeapSort hobj = new HeapSort(array, arrayLength);
				break;
			default:
				System.out.println("Wrong Selection");
				break;
		}
		
		
		// Select the sorting algorithm to run
		
		// switch statement to call sorting algorithms and printing them
		
	}
	
	// checking weather entered number is INTEGER
	public static int checkEnterValue()
	{
		// local variables
		boolean isUserInterInt = false;
		int userInput = 0;
				
		// calling for user input or keep calling till enter right value
		do 
		{
			try 
			{
				// Scanning the value which user will enter
				Scanner userReader = new Scanner(System.in);
				System.out.println("Pick a number: ");
				System.out.println("1 - Selection Sort\n2 - Bubble Sort\n3 - Insertion Sort"
						+ "\n4 - Quick Sort\n5 - Merge Sort\n6 - Max Heap Sort");
				userInput = userReader.nextInt();
				userReader.close();
				isUserInterInt = false;
			}
			catch(InputMismatchException e)
			{
				// call again until its not INT
				System.out.println("Invalid Input! Try again/n Enter a number: ");
				isUserInterInt = true;
			}
		}
		while(isUserInterInt);
		return(userInput);
	}


}
