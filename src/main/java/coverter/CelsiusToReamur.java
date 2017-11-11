package coverter;

public class CelsiusToReamur implements ConverterFromCelsius {
    @Override
    public double convertFromCelsius(int celsius) {
        return 4.0/5.0 * celsius;
    }
}
