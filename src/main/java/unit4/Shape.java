package unit4;


public interface Shape {
    public static final String ENTER_SIDE_A = "Enter side a, please";
    public static final String ENTER_SIDE_B = "Enter side b, please";

    public double getArea() throws AreaNonExistException;
}
