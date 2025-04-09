public class PracticeProblem {

	public static void main(String args[]) {

	}

	public static int[] bubbleSort(double[] nums) {
		int n = nums.length;
		int swaps = 0;
		int steps = 0;
		boolean swapped = true;

		for(int i = 0; i < n - 1 && swapped; i++) {
			swapped = false;

			for (int j = 0; j < n - 1 - i; j++) {
				steps++;
				if (nums[j] > nums[j+1]) {
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

	public static int[] bubbleSort1(double[] nums) {
		int n = nums.length;
		int swaps = 0;
		int steps = 0;
		boolean swapped = true;
		double[] doubleArr = new double[nums.length];

		for (int y = 0; y < n; y++) {
			doubleArr[y] = nums[y];
		}
		for (int i = 0; i < doubleArr.length - 1 && swapped; i++) {
			swapped = false;

			for (int j = 0; j < doubleArr.length - 1 - i; j++) {
				steps++;
				if(doubleArr[j] > doubleArr[j+1]) {
					double temp = doubleArr[j];
					doubleArr[j] = doubleArr[j+1];
					doubleArr[j+1] = temp;
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
		int n = nums.length;
		int swaps = 0;
		int steps = 0;

		for (int i = 0; i < n - 1; i++) {
			int minIndex = i;

			for (int j = i+1; j<n; j++) {
				steps++;
				if(nums[minIndex] > nums[j]) {
					minIndex = j;
					swaps++;
				}
			}
			double temp = nums[i];
			nums[i] = nums[minIndex];
			nums[minIndex] = temp;
			swaps += 3;
		}
		return new int[] {swaps, steps};
	}


	public static int[] selectionSort1(double [] nums) {

		int n = nums.length;
		int swaps = 0;
		int steps = 0;
		double[] doubleArr = new double[nums.length];

		for (int y = 0; y < n; y++) {
			doubleArr[y] = nums[y];
		}

		for (int i = 0; i < doubleArr.length - 1; i++) {
			int minIndex = i;

			for (int j = i+1; j<n; j++) {
				steps++;
				if(doubleArr[minIndex] > doubleArr[j]) {
					minIndex = j;
					swaps++;
				}
			}
			double temp = doubleArr[i];
			doubleArr[i] = doubleArr[minIndex];
			doubleArr[minIndex] = temp;
			swaps += 3;
		}
		return new int[] {swaps, steps};
	}

	public static int[] insertionSort(double[] nums) {
		int n = nums.length;
		int swaps = 0;
		int steps = 0;

		for (int i = 1; i < n; i++) {
			double key = nums[i];
			swaps++;
			int j = i - 1;

			while (j >= 0 && key < nums[j]) {
				steps++;
				if (nums[j] > key) {
					nums[j+1] = nums[j];
					swaps++;
					j--;
				}
				else {
					break;
				}
			}
			nums[j+1] = key;
			swaps++;
		}
		return new int[] {swaps, steps};
	}

	public static int[] insertionSort1(double[] nums) {
		int n = nums.length;
		int swaps = 0;
		int steps = 0;
		double[] doubleArr = new double [nums.length];

		for (int y = 0;  y < n; y++) {
			doubleArr[y] = nums[y];
		}

		for (int i = 1; i < doubleArr.length; i++) {
			double key = doubleArr[i];
			swaps++;
			int j = i - 1;

			while (j >= 0 && key < doubleArr[j]) {
				steps++;
				if(doubleArr[j] > key) {
					doubleArr[j+1] = doubleArr[j];
					swaps ++;
					j--;
				} else {
					break;
				}
			}
			doubleArr[j+1] = key;
			swaps++;
		}
		return new int[] {swaps, steps};
	}

	public static String leastSwaps(double[] nums) {
		if(insertionSort1(nums)[0] < bubbleSort1(nums)[0]) {
			if(selectionSort1(nums)[0] < insertionSort(nums)[0]) {
				return "Selection";

		}
		 else {
			return "Insertion";
		}
	}
		else if (selectionSort(nums)[0] < bubbleSort(nums)[0]) {
			return "Selection";
		} else {
			return "Bubble";
		}
	}

	public static String leastIterations(double[] nums) {
		if(insertionSort1(nums)[1] < bubbleSort1(nums)[1]) {
			if(selectionSort1(nums)[1] < insertionSort(nums)[1]) {
				return "Selection";

		}
		 else {
			return "Insertion";
		}
	}
		else if (selectionSort(nums)[1] < bubbleSort(nums)[1]) {
			return "Selection";
		} else {
			return "Bubble";
		}
		
	}
}
