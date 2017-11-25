package main;

import coverter.ConverterFromCelsius;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<ConverterFromCelsius> convertersFromCelsius = new ArrayList<>();
        convertersFromCelsius.add((celsius) -> 9.0/5.0 * celsius + 32.0);
        convertersFromCelsius.add((celsius) -> 4.0/5.0 * celsius);
        convertersFromCelsius.add((celsius) ->  273.16 + celsius );
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
