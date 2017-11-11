package main;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        double fahrenheit, reamur;
        for (int celsius = 0; celsius <= 100; celsius += 10) {
            fahrenheit = main.celsiusToFahrenheit(celsius);
            reamur = main.celsiusToReamur(celsius);
            System.out.println(celsius + ", " + fahrenheit + ", " + reamur);
        }
    }

    private double celsiusToReamur(int celsius) {
        return 4.0/5.0 * celsius;
    }

    private double celsiusToFahrenheit(int celsius) {
        return 9.0/5.0 * celsius + 32.0;
    }
}
