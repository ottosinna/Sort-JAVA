import java.util.Scanner;
import java.lang.Math;

class Driver{

  	public static void main(String[] args) {

    	Scanner sc = new Scanner(System.in);
		System.out.print("What size do you want the array: ");
    	int s = Integer.parseInt(sc.nextLine());
		int[] nums = new int[s];

    	for(int i = 0; i < nums.length; i++){
     	nums[i] = (int) (Math.random() * 1000) + 1;
    	}
    	print(nums);
		print("");
    	print("What sort would you like to choose?");
		print("");
		
		while(true){
			String response = menu();
			if(response.equals("0")){
				
				print("Exiting Application...");
				print("");
				break;
			}
			else if(response.equals("1")){
        		Sort.bubbleSort(nums);
				print(nums);
				print("");

			}
			else if(response.equals("2")){
        		Sort.insertionSort(nums);
				print(nums);
				print("");
			}
      		else if(response.equals("3")){
        		Sort.selectionSort(nums);
				print(nums);	
				print("");
			}
			else if(response.equals("4")){
        		Sort.heapSort(nums);
				print(nums);
				print("");
			}		
    	}
  	}
  	public static void print(int[] nums){
		for(int i = 0; i < nums.length; i++){
      	System.out.print(nums[i] + " "); 
    	}
    	print(" ");
	}
	
	public static String menu(){
		Scanner sC = new Scanner(System.in);
		print("Options: \n Option 0: Exit Application \n Option 1: Bubble Sort \n Option 2: Insertion Sort  \n Option 3: Selection Sort  \n Option 4: Heap Sort");
		print("");
		return sC.nextLine();
	}
	public static void print(String s) {
        System.out.println(s);
    }
}
