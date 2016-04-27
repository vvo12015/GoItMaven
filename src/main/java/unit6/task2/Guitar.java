package unit6.task2;

public class Guitar extends Instrument {

    public static final String GUITAR = "guitar";

    public Guitar() {
        super(GUITAR);
    }

    public Guitar(String name, int price, String article, String description, String color)
    {
        super(name, price, article, description, color);
    }
}
