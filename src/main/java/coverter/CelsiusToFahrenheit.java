package coverter;

public class CelsiusToFahrenheit implements ConverterFromCelsius {
    @Override
    public double convertFromCelsius(int celsius) {
        return 9.0/5.0 * celsius + 32.0;
    }
}
