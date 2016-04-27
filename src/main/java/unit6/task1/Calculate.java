package unit6.task1;

import unit4.*;

public class Calculate {

    public double parseCelsiusToFahrenheit(double tCels){
        double tFahrenheit;
        tFahrenheit = (double) 9 / 5;
        tFahrenheit = tFahrenheit * tCels + 32;
        return tFahrenheit;
    }

    public double parseFahrenheitToCelsius(double tFahr){
        double tCelsius;
        tCelsius = (double) 5 / 9;
        tCelsius = tCelsius * (tFahr - 32);
        return tCelsius;
    }

}
