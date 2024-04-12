package ConversorMoeda;

public class ConversorMoeda implements ConversaoFinanceira{
    private double valorReal;
    private double valorDolar;

    public double getValorReal() {
        return valorReal;
    }

    public void setValorReal(double valorReal) {
        this.valorReal = valorReal;
    }

    public double getValorDolar() {
        return valorDolar;
    }

    public void setValorDolar(double valorDolar) {
        this.valorDolar = valorDolar;
    }

    @Override
    public double converterDolarParaReal() {
        return valorReal = valorReal * valorDolar;
    }
}
