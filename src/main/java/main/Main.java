package main;

import coverter.CelsiusToFahrenheit;
import coverter.CelsiusToReamur;
import coverter.ConverterFromCelsius;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        double fahrenheit, reamur;
        ConverterFromCelsius celsiusToFahrenheit = new CelsiusToFahrenheit();
        ConverterFromCelsius celsiusToReamur = new CelsiusToReamur();
        for (int celsius = 0; celsius <= 100; celsius += 10) {
            fahrenheit = celsiusToFahrenheit.convertFromCelsius(celsius);
            reamur = celsiusToReamur.convertFromCelsius(celsius);
            System.out.println(celsius + ", " + fahrenheit + ", " + reamur);
        }
    }
}
