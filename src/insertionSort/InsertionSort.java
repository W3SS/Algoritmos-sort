package insertionSort;

public class InsertionSort {

	public int[] sort(int[] array) {
		for (int i = 1; i < array.length; i++) {
			int countSubArranjo = i;
			
			while (countSubArranjo > 0 && array[countSubArranjo] < array[countSubArranjo - 1]) {
				final int aux = array[countSubArranjo];
				array[countSubArranjo] = array[countSubArranjo - 1];
				array[countSubArranjo - 1] = aux;
				countSubArranjo--;
			}
		}

		return array;
	}
}
