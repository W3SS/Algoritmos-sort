package insertionSort;

public class InsertionSortMain {

	public static void main(String[] args) {
		InsertionSort insertSort = new InsertionSort();
		int[] array = {0,6,89,1,34, 23, 0};
		array = insertSort.insertSort(array);
		
		for (int i : array) {
			System.out.println(i);
		}

	}

}
