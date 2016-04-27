package unit5;

public class SelectionSort extends AbstractSort{

    private static final String SELECTION_SORT = "SelectionSort is: ";

    public SelectionSort(int[] arr) {
        super(SELECTION_SORT, arr);
    }

    @Override
    public void sort() {
        int min, indexMin;

        for (int i = 1; i < arr.length;i++) {
            min = arr[i-1];
            indexMin = i-1;
            for (int j = i; j < arr.length; j++) {
                if (min > arr[j]) {
                    min = arr[j];
                    indexMin = j;
                }
            }
            arr[indexMin] = arr[i-1];
            arr[i-1] = min;
        }
    }
}
