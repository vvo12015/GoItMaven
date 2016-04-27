package unit6.task2;

public class Piano extends Instrument {

    public static final String PIANO = "piano";

    public Piano(String name, int price, String article, String description, String color)
    {
        super(name, price, article, description, color);
    }

    public Piano(){
        super(PIANO);
    }
}
