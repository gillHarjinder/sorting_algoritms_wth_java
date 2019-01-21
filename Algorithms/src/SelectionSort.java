
public class SelectionSort {

	public SelectionSort(Integer[] array, int arrayLength) {
		// Unsorted array
		Integer[] sortedArray = array;
		
		// Sorting start time
		long startTime = System.nanoTime();
		
		// one by one move boundary of unsorted sub array
		for(int i = 0; i < arrayLength - 1; i++)
		{
			// Find the minimum element in unsorted array
			int minElemInx = i;
			for(int j = i+1; j < arrayLength; j++)
			{
				if(sortedArray[j] < sortedArray[minElemInx])
				{
					minElemInx = j;
				}
			}
			// Swap the minimum element with first element.
			int temp = sortedArray[minElemInx];
			sortedArray[minElemInx] = sortedArray[i];
			sortedArray[i] = temp;
		}
		
		// Sorting end time
		long endTime = System.nanoTime();
		System.out.println("Took "+(endTime - startTime) + " ns");
		
		printit(sortedArray);
	}
	
	public void printit(Integer[] array) 
	{
		System.out.println("\nArray Sorted by Selection Sort:");
		System.out.print("[ ");
		for(int j = 0; j < array.length; j++)
		{
			System.out.print(array[j] + " ");
		}
		System.out.print("]");
	}

}
