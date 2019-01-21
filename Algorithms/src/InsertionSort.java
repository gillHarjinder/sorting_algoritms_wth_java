
public class InsertionSort {

	public InsertionSort(Integer[] array, int arrayLength) 
	{
		// Unsorted array
		Integer[] sortedArray = array;
		
		// Sorting start time
		long startTime = System.nanoTime();
		
		for(int i = 1; i < arrayLength; i++)
		{
			int key = sortedArray[i];
			int sortingStartPostion = i - 1;
			
			/* Move elements of sortedArray[0..i-1], that are 
            greater than key, to one position ahead 
            of their current position */
			while(sortingStartPostion >= 0 && sortedArray[sortingStartPostion] > key) 
			{
				sortedArray[sortingStartPostion + 1] = sortedArray[sortingStartPostion];
				sortingStartPostion = sortingStartPostion - 1;
			}
			sortedArray[sortingStartPostion + 1] = key;
		}
		// Sorting end time
		long endTime = System.nanoTime();
		System.out.println("Took "+(endTime - startTime) + " ns");
		
		printit(sortedArray);
	}
	
	public void printit(Integer[] array) 
	{
		System.out.println("\nArray Sorted by Insertion Sort:");
		System.out.print("[ ");
		for(int j = 0; j < array.length; j++)
		{
			System.out.print(array[j] + " ");
		}
		System.out.print("]");
	}

}
