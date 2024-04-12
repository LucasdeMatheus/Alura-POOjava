package ConversorTemperatura;

public class Main {
    public static void main(String[] args) {
        ConversorTemperaturaPadrao conversor = new ConversorTemperaturaPadrao();
        conversor.setTemperaturaFahrenheit(98);
        System.out.println("Celsius para Fahrenheit: " + conversor.celsiusParaFahrenheit());

        conversor.setTemperaturaCelsius(27);
        System.out.println("\nFahrenheit para Celcius: " + conversor.fahrenheitParaCelsius());
    }
}
