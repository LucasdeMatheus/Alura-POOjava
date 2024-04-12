package Carro;

public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro();

        carro.setModelo("Honda");
        carro.setPreco1(200000);
        carro.setPreco2(210000);
        carro.setPreco3(300000);

        carro.calcularPreco();
        carro.exibirModelo();
    }
}
