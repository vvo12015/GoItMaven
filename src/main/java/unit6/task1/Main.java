package unit6.task1;

import unit4.Calculate;

/**
 * Created by vvo12 on 18.03.2016.
 */
public class Main {
    public static void main(String[] args) {
        String s;
        Reader reader = new Reader();
        Calculate calculate = new Calculate();
        s = reader.getString("Parse to Celsius(c), parse to Fahranheit(f)");
        double tCelsius, tFahranheit;
        try {
            if (s.equals("c")){
                tFahranheit = reader.getDouble("Please, enter degree Fahranheit");
                tCelsius = calculate.parseFahrenheitToCelsius(tFahranheit);
                System.out.printf("Celsius is: " + tCelsius);
            }
            else if (s.equals("f")){
                tCelsius = reader.getDouble("Please, enter degree Celsius");
                tFahranheit = calculate.parseCelsiusToFahrenheit(tCelsius);
                System.out.printf("Fahrenheit is: " + tFahranheit);
            }
            else {
                System.err.println("Error for converter");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
