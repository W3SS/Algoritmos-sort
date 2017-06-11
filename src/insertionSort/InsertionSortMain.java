package insertionSort;

public class InsertionSortMain {

	public static void main(String[] args) {
		InsertionSort insertSort = new InsertionSort();
		String[] array = {"marcelo", "ana", "jessyca"};
		array = insertSort.sort(array);
		
		for (String i : array) {
			System.out.println(i);
		}

	}

}
