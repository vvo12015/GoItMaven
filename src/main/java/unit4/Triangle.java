package unit4;


public class Triangle extends Rectangle implements Shape, ConstantsUnit4 {

    private static final String ENTER_SIDE_C = "Enter side c, please";

    private double c;

    Triangle(Reader reader){

        super(reader);
        this.c = reader.getDouble(ENTER_SIDE_C);

    }

    public Triangle(double a, double b, double c) {

        super(a, b);
        this.c = c;

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

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    @Override
    public double getArea(){

        double areaTriangle;
        double perimeter;
        double p;//1/2 perimeter

        double a = this.a;
        double b = this.b;
        double c = this.c;

        perimeter = a + b + c;
        p = perimeter / FOR_SUBPEREMETR;

        areaTriangle = Math.sqrt(p * (p - a) * (p - b) * (p - c));

        return areaTriangle;
    }
}
