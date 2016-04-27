package unit4;

public class Main implements ConstantsUnit4 {

    private static final Reader reader = new Reader();

    public static void main(String[] args) {

        String s = reader.getString(MESSAGE_FOR_WELCOME_PROGRAM);

        try {
            if (s.equals(KEY_TRIANGLE)){

                PrintShapeArea(new Triangle(reader).getArea());

            }else if (s.equals(KEY_RECTANGLE)) {

                PrintShapeArea(new Rectangle(reader).getArea());

            }else if (s.equals(KEY_CIRCLE)) {

                PrintShapeArea(new Circle(reader).getArea());

            }else if (s.equals(PRESS_KEY_FOR_DISTANCE_BETWEEN_POINTS)) {

                printDistance(Calculate.getDistance(createPointThroughConsole(), createPointThroughConsole()));

            }else if (s.equals(KEY_PARSING_DEGREES)) {

                System.out.println(ConvertorDegree(reader));

            }else {

                    System.err.println(ERROR_FOR_CONVERTER);

            }
        } catch (Exception e) {

            System.err.print(ERROR_PRESS_KEY);

        }
    }

    private static String ConvertorDegree(Reader reader) {


        String s = reader.getString(PARSE_TO_CELSIUS_C_PARSE_TO_FAHRANHEIT_F);

        double tCelsius;//degrees of Celsius
        double tFahranheit;//degrees of Fahranheit

        try {

            if (s.equals(KEY_PARSING_FAHRANHEIT_TO_CELSIUS)) {

                tCelsius = Calculate.parseFahrenheitToCelsius(reader.getDouble(ENTER_DEGREE_FAHRANHEIT));

                return printCelsius(tCelsius);

            } else if (s.equals(KEY_PARSING_CELSIUS_TO_FAHRANHEIT)) {

                tFahranheit = Calculate.parseCelsiusToFahrenheit(reader.getDouble(ENTER_DEGREE_CELSIUS));

                return printFarenhait(tFahranheit);

            } else {

                System.err.println(ERROR_FOR_CONVERTER);
                return ERROR_FOR_CONVERTER;

            }
        } catch (Exception e) {

            System.err.println(e.getMessage());
            return e.getMessage();

        }
    }

    private static String printFarenhait(double tFahranheit) {
        return FAHRENHEIT_IS + tFahranheit;
    }

    private static String printCelsius(double tCelsius) {
       return CELSIUS_IS + tCelsius;
    }

    private static void printDistance(double distance) {
        System.out.printf(DISTANCE_BETWEEN_TWO_POINTS_IS + distance);
    }

    private static void PrintShapeArea(double area) throws AreaNonExistException {

        System.out.println(THE_AREA_OF_SHAPE_IS + area);
    }

    private static Point createPointThroughConsole() {

        return new Point(reader.getInt(ENTER_X_POINT),
                reader.getInt(ENTER_Y_POINT));
    }

}
