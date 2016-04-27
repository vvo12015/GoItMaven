package unit5;

public class Main {

    public static void main(String[] args) {
        RandomArea randomArea = new RandomArea(10, 100);

        randomArea.showResult();

        SelectionSort selectionSort = new SelectionSort(randomArea.getArray());
        selectionSort.sort();
        selectionSort.showResult();

        InsertionSort insertionSort = new InsertionSort(randomArea.getArray());
        insertionSort.sort();
        insertionSort.showResult();

        BubbleSort bubbleSort = new BubbleSort(randomArea.getArray());
        bubbleSort.sort();
        bubbleSort.showResult();
    }
}
