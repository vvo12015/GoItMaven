package unit6.task2;

public class Trumpet extends Instrument {

    public static final String TRUMPET = "trumpet";

    public Trumpet() {
        super(TRUMPET);
    }

    public Trumpet(String name, int price, String article, String description, String color)
    {
        super(name, price, article, description, color);
    }
}
