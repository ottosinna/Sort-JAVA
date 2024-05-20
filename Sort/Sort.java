class Sort {
	
	public static void swap(int[] arr, int j) {
		int tmp = arr[j+1];
		arr[j+1] = arr[j];
		arr[j] = tmp;
	}
	
	public static void swap(int[] arr, int minIndex, int i) {
		int tmp = arr[minIndex];
		arr[minIndex] = arr[i];
		arr[i] = tmp;
	}

	// O(n^2)
	// Bubble Sort
	public static void bubbleSort(int[] arr) {		
		for(int i = 0; i < arr.length - 1; i++) {			
			for(int j = 0; j < arr.length-i-1; j++) {				
				if(arr[j] > arr[j+1]) {					
					swap(arr, j);					
				}
			}
		}		
	}
	
	// O(n^2)
	// Insertion Sort
	public static void insertionSort(int[] arr) {
		for(int i = 1; i < arr.length; i++) {
			int key = arr[i];
			int j = i - 1;			
			while(j >= 0 && arr[j] > key) {
				arr[j+1] = arr[j];
				j = j - 1;
			}
			arr[j + 1] = key;			
		}	
	}
	
	// O(n^2)
	// Selection Sort
	public static void selectionSort(int[] arr) {	
		for(int i = 0; i < arr.length-1; i++) {
			int minIndex = i;
			for(int j = i+1; j < arr.length; j++) {
				if(arr[j] < arr[minIndex]) {
					minIndex = j;
				}						
			}			
			swap(arr, minIndex, i);		
		}	
	}

	// add heapSort to sort integers (bring anything you need from the Heap class for the heapSport to compile)

	public static void heapSort(int[] arr) {
		// Build max heap
		for (int i = arr.length / 2 - 1; i >= 0; i--) {
			fixDown(i, arr.length - 1, arr);
		}
	
		// Extract elements from heap one by one
		for (int i = arr.length - 1; i > 0; i--) {
			// Swap the root (maximum value) with the last element
			int tmp = arr[0];
			arr[0] = arr[i];
			arr[i] = tmp;
	
			// Heapify the root element to get the new maximum element
			fixDown(0, i - 1, arr);
		}
	}

	public static void fixDown(int index, int upTo, int[] arr){
        if (upTo < 0) { 
            upTo = arr.length-1;
        }
        while (index <= upTo) {
            int left = 2 * index + 1;
            int right = 2 * index + 2;
            if (left <= upTo) {
                int swap;

                if (right > upTo) {
                    swap = left;
                } 
                else {
                    int leftCild = arr[left];
                    int rightChild = arr[right];

                    if(leftCild > rightChild) {
                        swap = left;
                    }
                    else {
                        swap = right;
                    }
                }

                int someItem = arr[index];
                int swapItem = arr[swap];

                if (someItem<swapItem) {
                    int tmp = arr[index];
                    arr[index] = arr[swap];
                    arr[swap] = tmp;
                } 
                else {
                    break;
                }
                index = swap;
            } 
            else {
                break;
            }

        }

    }
}

/* Create a driver that prints the following menu:

0. Exit

1. Bubble Sort

2. Insertion Sort

3. Selection Sort

4. Heap Sort

Ask the user which sort method they would like to use.

Before calling the sort method, ask the user for the size of the array they would like to sort.

Generate an array of the provided size with random integers (use any range for the random integers)

Print the random integer array

Call the sort

Print the sorted array

HeapSort Note/Hints:

1. Need to convert the heapSort from the Heap assignment into a static method which takes an int[] array as input.

2. Change HeapItem to int

3. Bring fixDown and modify the method to work with int[] array

4. Instead of “cp” (current position), need to use array.length

5. This is a challenging task, see if you can hack it!
 */