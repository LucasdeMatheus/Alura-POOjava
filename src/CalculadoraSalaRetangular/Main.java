package CalculadoraSalaRetangular;

public class Main {
    public static void main(String[] args) {
        CalculadoraSalaRetangular calculadora = new CalculadoraSalaRetangular();
        calculadora.setAltura(5);
        calculadora.setLargura(10);
        System.out.println(calculadora.calcularArea());
        System.out.println(calculadora.calcularPerimetro());
    }
}
