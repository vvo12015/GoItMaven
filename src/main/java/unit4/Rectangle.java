package unit4;

public class Rectangle implements Shape{

    protected double a;
    protected double b;

    public Rectangle(Reader reader){

        this.a = reader.getDouble(ENTER_SIDE_A);
        this.b = reader.getDouble(ENTER_SIDE_B);

    }
    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getArea() throws AreaNonExistException {

        double area = this.a * this.b;

        if (area <= 0){
            throw new AreaNonExistException(area);
        }
        return area;

    }
}
