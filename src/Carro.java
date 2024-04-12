public class Carro {
    String modelo;
    String cor;
    int ano;
    int idade;

    void exibirFicha(){
        System.out.println("""
                ***************************************************
                Modelo: %s
                Cor: %s
                Ano: %d
                idade: %d
                """.formatted(modelo,cor,ano, idade));
    }

    void calcularIdade(int anoAtual){
        idade = anoAtual - ano;
    }
}
