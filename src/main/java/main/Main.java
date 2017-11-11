package main;

import coverter.CelsiusToFahrenheit;
import coverter.CelsiusToKelvin;
import coverter.CelsiusToReamur;
import coverter.ConverterFromCelsius;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<ConverterFromCelsius> convertersFromCelsius = new ArrayList<>();
        convertersFromCelsius.add(new CelsiusToFahrenheit());
        convertersFromCelsius.add(new CelsiusToReamur());
        convertersFromCelsius.add(new CelsiusToKelvin());
        for (int celsius = 0; celsius <= 100; celsius += 10) {
            StringBuilder stringBuilder = new StringBuilder();
            for (ConverterFromCelsius converterFromCelsius: convertersFromCelsius) {
                stringBuilder.append(converterFromCelsius.convertFromCelsius(celsius));
                stringBuilder.append(",");
            }
            System.out.println(stringBuilder);
        }
    }
}
