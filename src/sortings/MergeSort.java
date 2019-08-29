package sortings;

public class MergeSort {
	private int[] array;
	private int[] tempMergArr;
	private int length;


	public void sort(int inputArr[]) {
		this.array = inputArr;
		this.length = inputArr.length;
		this.tempMergArr = new int[length];
		doMergeSort(0, length - 1);
	}


	private void doMergeSort(int lowerIndex, int higherIndex) {

		if (lowerIndex < higherIndex) {
			int middle = lowerIndex + (higherIndex - lowerIndex) / 2;
			// Below step sorts the left side of the array
			doMergeSort(lowerIndex, middle);
			// Below step sorts the right side of the array
			doMergeSort(middle + 1, higherIndex);
			// Now merge both sides
			mergeParts(lowerIndex, middle, higherIndex);
		}
	}	


	private void mergeParts(int lowerIndex, int middle, int higherIndex) {

		int i = lowerIndex;
		int j = middle + 1;
		int k = lowerIndex;

		//copy of the original array into the temp array
		for (int z = lowerIndex; z <= higherIndex; z++) {
			tempMergArr[z] = array[z];
		}


		while (i <= middle && j <= higherIndex) {
			if (tempMergArr[i] <= tempMergArr[j]) {
				array[k] = tempMergArr[i];
				i++;
			} else {
				array[k] = tempMergArr[j];
				j++;
			}
			k++;
		}


		while (i <= middle) {
			array[k] = tempMergArr[i];
			k++;
			i++;
		}
	}

}
