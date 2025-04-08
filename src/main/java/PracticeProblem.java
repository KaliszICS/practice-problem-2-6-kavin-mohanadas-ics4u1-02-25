public class PracticeProblem {

	public static void main(String args[]) {

	}

	public static int[] bubbleSort(double[] nums) {
		int swaps = 0;
		int steps = 0;
		int n = nums.length;
		for (int i = 0; i < n - 1; i++) {
			boolean swapped = false;

			for (int j = 0; j < n - 1 - i; j++) {
				steps++;
				if (nums[j] > nums [j+1]) {
					double temp = nums[j];
					nums[j] = nums[j+1];
					nums[j+1] = temp;
					swaps += 3;
					swapped = true;
				}
			}
			if (!swapped) {
				break;
			}
		}
		return new int[] {swaps, steps};
	}

	public static int[] selectionSort(double[] nums) {
		int swaps = 0;
		int steps = 0;
		int n = nums.length;

		for (int i = 0; i < n - 1; i++) {
			int minIndex = i;
			int updateCount = 0;
			for (int j = i + 1; j < n; j++) {
				steps++;
				if (nums[j] < nums[minIndex]) {
					minIndex = j;
					updateCount++;
				}
			}
			if (minIndex != i) {
				double temp = nums[i];
				nums[i] = nums[minIndex];
				nums[minIndex] = temp;
				swaps += (3 + updateCount);
			}
		}
		if (swaps > 0) {
			swaps += 3;
		}
		
		return new int[] {swaps, steps};
	}

	public static int[] insertionSort(double[] nums) {
		int swaps = 0;
		int steps = 0;
		int n = nums.length;
		for (int i = 1; i < n; i++) {
			double key = nums[i];
			swaps++;
			int j = i - 1;

			while (j >= 0) {
				if(nums[j] > key) {
					steps++;
					nums[j+1] = nums[j];
					swaps++;
					j--;
				} else {
					break;
		}
		
			}
		
		nums[j+1] = key;
		swaps++;
	}
	return new int[] {swaps, steps};


}

	public static String leastSwaps(double[] nums) {
		double[] arrBubble = new double[nums.length];
		double[] arrSelection = new double[nums.length];
		double[] arrInsertion = new double[nums.length];
		for (int i = 0; i < nums.length; i++) {
			arrBubble[i] = nums[i];
			arrSelection[i] = nums[i];
			arrInsertion[i] = nums[i];
		}
		int[] bubbleMetrics = bubbleSort(arrBubble);
		int[] selectionMetrics = selectionSort(arrSelection);
		int[] insertionMetrics = insertionSort(arrInsertion);

		int bubbleSwaps = bubbleMetrics[0];
		int selectionSwaps = selectionMetrics[0];
		int insertionSwaps = insertionMetrics[0];

		int min = bubbleSwaps;
		if (selectionSwaps < min) {
			min = selectionSwaps;
		}
		if (insertionSwaps < min) {
			min = insertionSwaps;
		}
		if (bubbleSwaps == min) {
			return "Bubble";
		}
		if (insertionSwaps == min) {
			return "Insertion";
		}
		return "Selection";
	}

	public static String leastIterations(double[] nums) {
		double[] arrBubble = new double[nums.length];
		double[] arrSelection = new double[nums.length];
		double[] arrInsertion = new double[nums.length];
		for (int i = 0; i < nums.length; i++) {
			arrBubble[i] = nums[i];
			arrSelection[i] = nums[i];
			arrInsertion[i] = nums[i];
		}
		int[] bubbleMetrics = bubbleSort(arrBubble);
		int[] selectionMetrics = selectionSort(arrSelection);
		int[] insertionMetrics = insertionSort(arrInsertion);

		int bubbleSteps = bubbleMetrics[1];
		int selectionSteps = selectionMetrics[1];
		int insertionSteps = insertionMetrics[1];

		int min = bubbleSteps;
		if (selectionSteps < min) {
			min = selectionSteps;
		}
		if (insertionSteps < min) {
			min = insertionSteps;
		}
		if (bubbleSteps == min) {
			return "Bubble";
		}
		if (insertionSteps == min) {
			return "Insertion";
		}
		return "Selection";
	}
}

	

	
