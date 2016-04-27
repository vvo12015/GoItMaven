package unit5;

class BubbleSort extends AbstractSort{

    private static final String BUBBLE_SORT = "BubbleSort is:";

    BubbleSort(int[] arr){
        super(BUBBLE_SORT, arr);
    }

    @Override
    public void sort(){

        int min;

        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 1; j < arr.length - i; j++) {

                if (arr[j-1] > arr[j]){
                    min = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = min;
                }

            }
        }
    }
}
