package unit4;

public class Circle implements Shape, ConstantsUnit4 {

    private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() throws AreaNonExistException {

        double area = Math.PI * this.radius * this.radius;

        if (area <= 0 ) {throw new AreaNonExistException(area);}
        return Math.PI * this.radius * this.radius;
    }


    Circle(Reader reader){
        this.radius = reader.getInt(ENTER_SIDE_RADIUS);
    }
    public Circle(double radius) {
        this.radius = radius;
    }


}
