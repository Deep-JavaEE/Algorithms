package algo;

/**
 * This covers
 * 1) Creating int array of some specific size
 * 2) Finding Value at a given Index
 * 3) Chekin if Array containes a value
 * 4) Deleting an Array element on a given index
 * 5) Insering a value at end of an array
 * 6) Linear Search
 * 
 * @author jmatharu Jagdeep Matharu
 *
 */
public class ArrayStructures {
	private int[] theArray = new int[10];
	int arrayLength = theArray.length;

	public static void main(String[] args) {
		ArrayStructures newArray = new ArrayStructures();
		newArray.generateRandomArray();
		System.out.println("Initial Array");
		newArray.printArray();
		System.out.println("----------End Initial Array----------\n");

		System.out.println("Get Value at Index (9) : " + newArray.getValueAtIndex(9));
		System.out.println("Get Value at Index with Index : " + newArray.getValueAtIndexWithIndex(9));

		System.out.println("Does Array contains this value : " + newArray.doesArrayContainThisValue(20));
		System.out.println(
				"Does Array contains this value with Index: " + newArray.doesArrayContainsThisValueWithIndex(39));

		newArray.deleteIndex(5);
		System.out.println("\nAfter Deleting from Array");
		newArray.printArray();
		System.out.println("----------End Deleting----------\n");

		newArray.insertValue(92);
		System.out.println("After Inserting in Array");
		newArray.printArray();
		System.out.println("----------End Inserting----------\n");

		System.out.println("Linear Search Algorithm");
		newArray.linearSearchForValue(20);
		newArray.printArray();
		System.out.println("----------End Linear Algorythm----------");
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
	 * Getting Value from Array List
	 * 
	 * @param index
	 * @return
	 */
	public int getValueAtIndex(int index) {
		if (index < arrayLength)
			return theArray[index];
		return 0;
	}

	/**
	 * Getting value from Array List With Index
	 * 
	 * @param index
	 * @return
	 */
	public String getValueAtIndexWithIndex(int index) {
		if (index < arrayLength)
			return "| " + theArray[index] + " | is at Index | " + index + " |";
		return "Index Out of Scope";
	}

	/**
	 * Verify if array has Value entered by User
	 * 
	 * @param searchValue
	 * @return
	 */
	public boolean doesArrayContainThisValue(int searchValue) {
		boolean valueInArray = false;
		for (int i = 0; i < arrayLength; i++) {
			if (theArray[i] == searchValue)
				valueInArray = true;
		}
		return valueInArray;
	}

	/**
	 * Verify if array has Value entered by User with Index
	 * 
	 * @param searchValue
	 * @return
	 */
	public String doesArrayContainsThisValueWithIndex(int searchValue) {
		for (int i = 0; i < arrayLength; i++) {
			if (theArray[i] == searchValue)
				return "| " + theArray[i] + " | is at Index | " + i + " |";
		}
		return searchValue + " not found!";
	}

	/**
	 * To delete Value of index and decrementing last
	 * 
	 * @param index
	 */
	public void deleteIndex(int index) {
		if (index < arrayLength) {
			for (int i = index; i < arrayLength - 1; i++) {
				theArray[i] = theArray[i + 1];
			}
			arrayLength--;
		}
	}

	/**
	 * Inserting value at last after deleting value
	 * 
	 * @param value
	 */
	public void insertValue(int value) {
		if (arrayLength < 50) {
			theArray[arrayLength] = value;
			arrayLength++;
		}
	}

	/**
	 * If we want to find ALL occurance of a value then use Linear Search
	 */
	public String linearSearchForValue(int value) {
		boolean valueInArray = false;
		String indexWithValues = "";
		System.out.println("Value was found on Index : ");
		for (int i = 0; i < arrayLength; i++) {
			if (theArray[i] == value) {
				valueInArray = true;
				System.out.println(i + " ");
				indexWithValues += i + " ";
			}
		}
		if (!valueInArray) {
			indexWithValues = value + " is not found in Array!";
			System.out.println(indexWithValues);
		}

		return indexWithValues;
	}
}
