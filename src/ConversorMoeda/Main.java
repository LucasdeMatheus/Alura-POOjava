package ConversorMoeda;

public class Main {
    public static void main(String[] args) {
        ConversorMoeda conversao1 = new ConversorMoeda();
        conversao1.setValorDolar(50);
        conversao1.setValorReal(5);
        System.out.println(conversao1.converterDolarParaReal());
    }
}
