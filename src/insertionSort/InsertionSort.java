package insertionSort;

public class InsertionSort {

	public int[] insertSort(int[] array) {
		for (int i = 1; i < array.length; i++) {
			boolean hasChange = true;
			int countSubArranjo = i;

			while (hasChange && countSubArranjo > 0) {
				if (array[countSubArranjo] < array[countSubArranjo - 1]) {
					final int aux = array[countSubArranjo];
					array[countSubArranjo] = array[countSubArranjo - 1];
					array[countSubArranjo - 1] = aux;
					countSubArranjo--;
				} else {
					hasChange = false;
				}
			}
		}

		return array;
	}
}
