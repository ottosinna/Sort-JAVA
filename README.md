The Sort class in Java implements four sorting algorithms: Bubble Sort, Insertion Sort, Selection Sort, and Heap Sort.
Each algorithm is provided as a static method to sort integer arrays, with utility methods for swapping elements. 
Bubble Sort, Insertion Sort, and Selection Sort have a time complexity of 𝑂(𝑛^2), while Heap Sort is more efficient at O(nlogn).
The Driver class facilitates user interaction, allowing array size input, random array generation, and selection of a sorting
method, demonstrating the functionality of the Sort class.

Class Methods

1. swap Methods
The class has two swap methods:

First swap Method: Swaps two adjacent elements in an array.

Second swap Method: Swaps two elements in an array at specified indices.

2. bubbleSort Method
Implements the Bubble Sort algorithm, which repeatedly steps through the list, compares adjacent elements, and swaps them if they
are in the wrong order. The pass through the list is repeated until the list is sorted.

3. insertionSort Method
Implements the Insertion Sort algorithm, which builds the final sorted array one item at a time. It is much less efficient on large
lists than more advanced algorithms such as quicksort, heapsort, or merge sort.

4. selectionSort Method
Implements the Selection Sort algorithm, which divides the input list into two parts: a sorted sublist of items which is built up from
 left to right at the front (left) of the list and a sublist of the remaining unsorted items. The algorithm repeatedly selects the smallest
(or largest, depending on sorting order) element from the unsorted sublist, swapping it with the leftmost unsorted element, and moving the
sublist boundaries one element to the right.

5. heapSort Method
Implements the Heap Sort algorithm, which is a comparison-based sorting technique based on a Binary Heap data structure. It is similar to
selection sort where we first find the maximum element and place it at the end. We repeat the same process for the remaining elements.





To use the Driver class, follow these steps:

Compile the Classes: Ensure both Sort and Driver classes are in the same directory and compile them using the Java compiler.


javac Sort.java 
javac Driver.java
Run the Driver Class: Execute the Driver class to start the program.

java Driver
Interact with the Program:

The program will first prompt you to enter the size of the array. Type the desired size and press Enter.
The program will generate an array of random integers and display it.
Next, you'll see a menu with sorting options:

Options: 
 Option 0: Exit Application 
 Option 1: Bubble Sort 
 Option 2: Insertion Sort  
 Option 3: Selection Sort  
 Option 4: Heap Sort
 
Type the number corresponding to your desired sorting algorithm and press Enter. The program will sort the array using the chosen algorithm and display the sorted array.
You can continue selecting different sorting options. To exit, choose Option 0.
