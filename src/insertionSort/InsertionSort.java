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
	
	public double[] sort(double[] array) {
		for (int i = 1; i < array.length; i++) {
			int countSubArranjo = i;
			
			while (countSubArranjo > 0 && array[countSubArranjo] < array[countSubArranjo - 1]) {
				final double aux = array[countSubArranjo];
				array[countSubArranjo] = array[countSubArranjo - 1];
				array[countSubArranjo - 1] = aux;
				countSubArranjo--;
			}
		}

		return array;
	}
	
	public char[] sort(char[] array) {
		for (int i = 1; i < array.length; i++) {
			int countSubArranjo = i;
			
			while (countSubArranjo > 0 && array[countSubArranjo] < array[countSubArranjo - 1]) {
				final char aux = array[countSubArranjo];
				array[countSubArranjo] = array[countSubArranjo - 1];
				array[countSubArranjo - 1] = aux;
				countSubArranjo--;
			}
		}

		return array;
	}
	
	public String[] sort(String[] array) {
		for (int i = 1; i < array.length; i++) {
			int countSubArranjo = i;
			
			while (countSubArranjo > 0 && array[countSubArranjo].compareTo(array[countSubArranjo - 1]) < 0) {
				final String aux = array[countSubArranjo];
				array[countSubArranjo] = array[countSubArranjo - 1];
				array[countSubArranjo - 1] = aux;
				countSubArranjo--;
			}
		}

		return array;
	}
}
