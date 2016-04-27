package unit5;

public class InsertionSort extends AbstractSort {

    private static final int beginArea = 0;
    private static final String INSERTION_SORT = "InsertionSort is: ";

    public InsertionSort(int[] arr) {
        super(INSERTION_SORT, arr);
    }

    @Override
    public void sort() {

        int min, indexMin, j;

        for (int i = 1; i < arr.length;i++) {

            j = i-1;
            min = arr[i];
            indexMin = beginArea;

            while(j >= beginArea){

                if (arr[i] > arr[j]){
                    indexMin = j+1;
                    min = arr[i];
                    j = -1;
                }
                else{
                    j--;
                }
            }

            offsetArray(indexMin, i);
            arr[indexMin] = min;

        }
    }

    private void offsetArray(int oldPositionElement, int newPositionElement) {
        for (int k = newPositionElement; k > oldPositionElement; k--) {
            arr[k] = arr[k-1];
        }
    }
}
