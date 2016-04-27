package unit5;

import java.util.Random;

public class RandomArea {

    private static final String MESSAGE_RANDOM_ARRAY = "Random array is:";
    private int count, valueRange;

    public int getValueRange() {
        return valueRange;
    }

    public void setValueRange(int valueRange) {
        this.valueRange = valueRange;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }

    private int[] array = new int[count];

    public RandomArea(int count, int valueRange) {

        this.count = count;
        this.valueRange = valueRange;
        this.array = new int[count];

        Random random = new Random();

        for (int i = 0; i < count; i++) {
            this.array[i] = random.nextInt(valueRange);
        }
    }

    public void showResult(){
        System.out.println(MESSAGE_RANDOM_ARRAY);
        for (int elArr : this.array)
        {
            System.out.println(elArr);
        }
    }
}
