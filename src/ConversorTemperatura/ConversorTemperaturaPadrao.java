package ConversorTemperatura;

public class ConversorTemperaturaPadrao implements ConversorTemperatura {
    private double temperaturaCelsius;
    private double temperaturaFahrenheit;

    public double getTemperaturaCelsius() {
        return temperaturaCelsius;
    }

    public void setTemperaturaCelsius(double temperaturaCelsius) {
        this.temperaturaCelsius = temperaturaCelsius;
    }

    public double getTemperaturaFahrenheit() {
        return temperaturaFahrenheit;
    }

    public void setTemperaturaFahrenheit(double temperaturaFahrenheit) {
        this.temperaturaFahrenheit = temperaturaFahrenheit;
    }

    @Override
    public double celsiusParaFahrenheit() {
        return (temperaturaCelsius * 9/5) + 32;
    }

    @Override
    public double fahrenheitParaCelsius() {
        return (temperaturaFahrenheit - 32) * (5.0/9.0);
    }
}
