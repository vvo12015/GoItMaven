package unit4;

public class AreaNonExistException extends Exception {
    private double area;

    public double getArea() {
        return area;
    }

    public AreaNonExistException(double area) {
        this.area = area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    @Override
    public String toString() {
        return "AreaNonExistException{" +
                "area=" + area +
                '}';
    }
}
