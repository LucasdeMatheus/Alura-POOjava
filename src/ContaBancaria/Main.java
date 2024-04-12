package ContaBancaria;

public class Main {
    public static void main(String[] args) {
        // não tem necessidade de eu fazer tudo
        ContaCorrente conta = new ContaCorrente();
        conta.depositar();
        conta.consultarSaldo();
        conta.sacar();
        conta.cobrarTarifaMensal();
    }
}
