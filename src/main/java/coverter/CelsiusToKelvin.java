package coverter;

public class CelsiusToKelvin implements ConverterFromCelsius {
    @Override
    public double convertFromCelsius(int celsius) {
        return 273.16 + celsius;
    }
}
