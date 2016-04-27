package unit5;

abstract class AbstractSort {

    private String message;
    protected int[] arr;

    protected AbstractSort(String message, int[] arr) {
        this.message = message;
        this.arr = arr.clone();
    }

    protected void showResult(){
        System.out.println(message);
        for (int elArr : arr) {
            System.out.println(elArr);
        }
    }

    abstract public void sort();
}
