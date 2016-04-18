package algo;

import java.util.Collections;

/**
 * This covers
 * 1) Printing Horizontal Array
 * 2) Linear Search
 * 3) Bubble Sort (Ascending)
 * 4) Bubble Sort (Descending)
 * 
 * @author jmatharu Jagdeep Matharu
 *
 */
public class SortAlgorithm {

	private int[] theArray = new int[10];
	int arrayLength = theArray.length;

	public static void main(String args[]) {
		SortAlgorithm newArray = new SortAlgorithm();
		// ArrayStructures newArray = new ArrayStructures();
		newArray.generateRandomArray();
		System.out.println("Initial Array");
		newArray.printArray();
		System.out.println("----------End Initial Array----------\n");
		System.out.println("");

		System.out.println("Linear Search Algorithm");
		newArray.linearSearchForValue(20);
		System.out.println("----------End Linear Algorythm----------\n");
		System.out.println("");

		System.out.println("Bubble Sort Ascending Algorithm");
		newArray.bubbleSortAsc();
		System.out.println("----------End Bubble Sort Ascending Algorythm----------");
		System.out.println("");

		System.out.println("Bubble Sort Descending Algorithm");
		newArray.bubbleSortDesc();
		System.out.println("----------End Bubble Sort Descending Algorythm----------");
		System.out.println("");

	}

	/**
	 * If we want to find ALL occurance of a value then use Linear Search
	 */
	public String linearSearchForValue(int value) {
		boolean valueInArray = false;
		String indexWithValues = "";

		for (int i = 0; i < arrayLength; i++) {
			if (theArray[i] == value) {
				valueInArray = true;
				// System.out.println(i + " ");
				indexWithValues += i + " ";
			}
			printHorzArrayForLinearSearch(i, -1);
		}
		if (!valueInArray) {
			indexWithValues = value + " is not found in Array!";

		}
		System.out.print("Value was found on Index : ");
		System.out.println(indexWithValues);
		return indexWithValues;
	}

	/**
	 * 
	 */
	public void bubbleSortAsc() {
		for (int i = arrayLength - 1; i > 1; i--) {
			for (int j = 0; j < i; j++) {
				if (theArray[j] > theArray[j + 1]) {
					swapValues(j, j + 1);
					printHorzArrayForBinarySearch(i, j);
				}
				printHorzArrayForBinarySearch(i, j);
			}
		}
	}

	/**
	 * 
	 */
	public void bubbleSortDesc() {
		for (int i = arrayLength - 1; i > 1; i--) {
			for (int j = 0; j < i; j++) {
				if (theArray[j] < theArray[j + 1]) {
					swapValues(j, j + 1);
					printHorzArrayForBinarySearch(i, j);
				}
				printHorzArrayForBinarySearch(i, j);
			}
		}
	}

	/**
	 * 
	 * @param indexOne
	 * @param indexTwo
	 */
	private void swapValues(int indexOne, int indexTwo) {
		// TODO Auto-generated method stub
		int temp = theArray[indexOne];
		theArray[indexOne] = theArray[indexTwo];
		theArray[indexTwo] = temp;
	}

	public void binarySearchForValue(int value) {

	}

	public void selectionSort() {

	}

	public void insertionSort() {

	}

	/**
	 * Generate random array of 50
	 */
	public void generateRandomArray() {
		for (int i = 0; i < arrayLength; i++) {
			theArray[i] = (int) (Math.random() * 20 + 1);
		}
	}

	/**
	 * Print An array
	 */
	public void printArray() {
		for (int i = 0; i < arrayLength; i++) {
			System.out.println("----------");
			System.out.print("| " + i + " | ");
			System.out.println(theArray[i] + " |");
		}
		System.out.println("----------");
	}

	/**
	 * @param i
	 * @param j
	 */
	private void printHorzArrayForBinarySearch(int i, int j) {
		// TODO Auto-generated method stub
		printHorzArrayHelper(i, j);
		// END OF FIRST PART
		// ADDED FOR BUBBLE SORT
		if (j != -1) {
			// ADD THE +2 TO FIX SPACING
			for (int k = 0; k < ((j * 5) + 2); k++)
				System.out.print(" ");
			System.out.print(j);

			// THEN ADD THIS CODE

			if (i != -1) {

				// ADD THE -1 TO FIX SPACING

				for (int l = 0; l < (5 * (i - j) - 1); l++)
					System.out.print(" ");

				System.out.println(i);
			}
			System.out.println();

		}
	}

	/**
	 * @param i
	 * @param j
	 */
	private void printHorzArrayForLinearSearch(int i, int j) {
		// TODO Auto-generated method stub
		printHorzArrayHelper(i, j);
		System.out.println(String.join("", Collections.nCopies(2 + i * 5, " ")) + i);
		System.out.println();
	}

	/**
	 * @param i
	 * @param j
	 */
	private void printHorzArrayHelper(int i, int j) {
		// TODO Auto-generated method stub
		for (int n = 0; n < 51; n++)
			System.out.print("-");
		System.out.println();
		for (int n = 0; n < arrayLength; n++) {
			System.out.print("| " + n + "  ");
		}
		System.out.print("|");
		System.out.println(" -----> Index Number");
		for (int n = 0; n < 51; n++)
			System.out.print("-");
		System.out.println();
		for (int n = 0; n < arrayLength; n++) {
			if (theArray[n] < 10) {
				System.out.print("| " + theArray[n] + "  ");
			} else {
				System.out.print("| " + theArray[n] + " ");
			}
		}
		System.out.print("|");
		System.out.println(" -----> Array Value on Index");
		for (int n = 0; n < 51; n++)
			System.out.print("-");
		System.out.println();
	}
}
