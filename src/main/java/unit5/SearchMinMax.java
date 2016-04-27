package unit5;

public class SearchMinMax {

    public static void main(String[] args) {

        int[] arr = {196, 358, 20, 42, 341, 748};
        int min, max;

        min = arr[0];
        max = arr[0];
        for (int i = 1; i < arr.length; i++){
            if (min > arr[i]){min = arr[i];}
            if (max < arr[i]){max = arr[i];}
        }

        System.out.println("The minimal value is: " + min);
        System.out.println("The maximal value is: " + max);
    }
}
