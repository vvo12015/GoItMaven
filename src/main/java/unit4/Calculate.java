package unit4;

public class Calculate implements ConstantsUnit4 {

    public static double getDistance(Point pointFirst, Point pointSecond){

        double distance;
        double x1 = pointFirst.getX();
        double y1 = pointFirst.getY();
        double x2 = pointSecond.getX();
        double y2 = pointSecond.getY();

        double dx = Math.abs(x1 - x2);
        double dy = Math.abs(y1 - y2);

        distance = Math.sqrt(Math.pow(dx, SQR) + Math.pow(dy, SQR));

        return distance;
    }

    static public double parseCelsiusToFahrenheit(double tCels){

        return FACTOR_TO_FAHRENHEIT * tCels + COEFFICIENT_FOR_PARSING_OF_DEGREE;
    }

    static public double parseFahrenheitToCelsius(double tFahr){

        return FACTOR_TO_CELSIUS * (tFahr - COEFFICIENT_FOR_PARSING_OF_DEGREE);
    }

}
