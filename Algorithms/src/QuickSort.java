
public class QuickSort {

	public QuickSort(Integer[] array, int arrayLength) {
		// Unsorted array
		Integer[] sortedArray = array;
		
		// Sorting start time
		long startTime = System.nanoTime();
		
		sort(sortedArray, 0, arrayLength-1);
		
		// Sorting end time
		long endTime = System.nanoTime();
		System.out.println("Took "+(endTime - startTime) + " ns");
		
		printit(sortedArray);
	}
	
	public int partition(Integer[] array, int low, int high) 
    { 
        int pivot = array[high];  
        int i = (low-1); // index of smaller element 
        for (int j=low; j<high; j++) 
        { 
            // If current element is smaller than or 
            // equal to pivot 
            if (array[j] <= pivot) 
            { 
                i++; 
  
                // swap array[i] and array[j] 
                int temp = array[i]; 
                array[i] = array[j]; 
                array[j] = temp; 
            } 
        } 
  
        // swap array[i+1] and array[high] (or pivot) 
        int temp = array[i+1]; 
        array[i+1] = array[high]; 
        array[high] = temp; 
  
        return i+1; 
    } 
  
  
    /* The main function that implements QuickSort() 
      array[] --> Array to be sorted, 
      low  --> Starting index, 
      high  --> Ending index */
    public void sort(Integer[] array, int low, int high) 
    { 
        if (low < high) 
        { 
            /* pi is partitioning index, array[pi] is  
              now at right place */
            int pi = partition(array, low, high); 
  
            // Recursively sort elements before 
            // partition and after partition 
            sort(array, low, pi-1); 
            sort(array, pi+1, high);
        } 
    } 
	
	public void printit(Integer[] array) 
	{
		System.out.println("\nArray Sorted by Quick Sort:");
		System.out.print("[ ");
		for(int j = 0; j < array.length; j++)
		{
			System.out.print(array[j] + " ");
		}
		System.out.print("]");
	}
}
