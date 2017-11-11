package main;

import coverter.CelsiusToFahrenheit;
import coverter.CelsiusToReamur;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        double fahrenheit, reamur;
        CelsiusToFahrenheit celsiusToFahrenheit = new CelsiusToFahrenheit();
        CelsiusToReamur celsiusToReamur = new CelsiusToReamur();
        for (int celsius = 0; celsius <= 100; celsius += 10) {
            fahrenheit = celsiusToFahrenheit.celsiusToFahrenheit(celsius);
            reamur = celsiusToReamur.celsiusToReamur(celsius);
            System.out.println(celsius + ", " + fahrenheit + ", " + reamur);
        }
    }
}
