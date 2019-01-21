public class BubbleSort 
{
	public BubbleSort(Integer[] array, int arrayLength) {
		// Unsorted array
		Integer[] sortedArray = array;
		
		// Sorting start time
		long startTime = System.nanoTime();
		
		for(int i = arrayLength - 1; i > 0; i--)
		{
			boolean isSorted = true;
			for(int j = 0; j < i; j++)
			{
				if(sortedArray[j] > sortedArray[j+1]) 
				{
					int k = sortedArray[j+1];
					sortedArray[j+1] = sortedArray[j];
					sortedArray[j] = k;
					isSorted = false;
				}
			}
			if(isSorted) 
			{
				break;
			}
		}
		
		// Sorting end time
		long endTime = System.nanoTime();
		System.out.println("Took "+(endTime - startTime) + " ns");
		
		printit(sortedArray);
	}

	public void printit(Integer[] array) 
	{
		System.out.println("\nArray Sorted by Bubble Sort:");
		System.out.print("[ ");
		for(int j = 0; j < array.length; j++)
		{
			System.out.print(array[j] + " ");
		}
		System.out.print("]");
	}
}
