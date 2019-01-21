
public class HeapSort {

	public HeapSort(Integer[] array, int arrayLength) {
		// Unsorted array
		Integer[] sortedArray = array;
				
		// Sorting start time
		long startTime = System.nanoTime();
				
		// Sorting end time
		long endTime = System.nanoTime();
		System.out.println("Took "+(endTime - startTime) + " ns");
				
		sort(sortedArray);
		
		printit(sortedArray);
	}
	
	public void sort(Integer[] arr) 
    { 
        int n = arr.length; 
  
        // Build heap (rearrange array) 
        for (int i = n / 2 - 1; i >= 0; i--) 
            heapify(arr, n, i); 
  
        // One by one extract an element from heap 
        for (int i=n-1; i>=0; i--) 
        { 
            // Move current root to end 
            int temp = arr[0]; 
            arr[0] = arr[i]; 
            arr[i] = temp; 
  
            // call max heapify on the reduced heap 
            heapify(arr, i, 0); 
        } 
    } 
  
    // To heapify a subtree rooted with node i which is 
    // an index in arr[]. n is size of heap 
    public void heapify(Integer[] arr, int n, int i) 
    { 
        int largest = i; // Initialize largest as root 
        int l = 2*i + 1; // left = 2*i + 1 
        int r = 2*i + 2; // right = 2*i + 2 
  
        // If left child is larger than root 
        if (l < n && arr[l] > arr[largest]) 
            largest = l; 
  
        // If right child is larger than largest so far 
        if (r < n && arr[r] > arr[largest]) 
            largest = r; 
  
        // If largest is not root 
        if (largest != i) 
        { 
            int swap = arr[i]; 
            arr[i] = arr[largest]; 
            arr[largest] = swap; 
  
            // Recursively heapify the affected sub-tree 
            heapify(arr, n, largest); 
        } 
    } 

	public void printit(Integer[] array) 
	{
		System.out.println("\nArray Sorted by Max Heap Sort:");
		System.out.print("[ ");
		for(int j = 0; j < array.length; j++)
		{
			System.out.print(array[j] + " ");
		}
		System.out.print("]");
	}
}
