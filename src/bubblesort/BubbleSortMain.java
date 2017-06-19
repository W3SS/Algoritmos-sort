package bubblesort;

public class BubbleSortMain {

	public static void main(String[] args) {
		BubbleSort bubbleSort = new BubbleSort();
		int[] array = {34,1,9,0,3};
		array = bubbleSort.sort(array);

		for (int i : array) {
			System.out.println(i);
		}
	}

}
