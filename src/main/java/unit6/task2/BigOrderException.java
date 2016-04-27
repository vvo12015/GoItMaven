package unit6.task2;

public class BigOrderException extends Exception{

    private static final String MESSAGE_FOR_ERROR = "Order failed because not enough warehouse";

    public BigOrderException() {
        super(MESSAGE_FOR_ERROR);
    }
}
