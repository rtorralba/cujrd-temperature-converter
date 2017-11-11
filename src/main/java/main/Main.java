package main;

public class Main {
    public static void main(String[] args) {
        double fahrenheit, reamur;
        for (int celsius = 0; celsius <= 100; celsius += 10) {
            fahrenheit = 9.0/5.0 * celsius + 32.0;
            reamur = 4.0/5.0 * celsius;
            System.out.println(celsius + ", " + fahrenheit + ", " + reamur);
        }
    }
}
