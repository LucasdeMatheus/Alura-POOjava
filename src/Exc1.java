public class Exc1 {
    public static void main(String[] args) {
        // Crie uma classe Pessoa com um método que exibe "Olá, mundo!" no console.
        Pessoa pessoa = new Pessoa();
        pessoa.hello();

        // Crie uma classe Calculadora com um método que recebe um número como parâmetro
        // e retorna o dobro desse número.
        Calculadora dobrar = new Calculadora();
        System.out.println(dobrar.dobro(10));

        // Crie uma classe Musica com atributos titulo, artista, anoLancamento,
        // avaliacao e numAvaliacoes, e métodos para exibir a ficha técnica,
        // avaliar a música e calcular a média de avaliações.
        Musica musica1 = new Musica();
        musica1.titulo = "Empathy";
        musica1.anoDeLancamento = 2010;
        musica1.artista = "Crystal Castles";
        musica1.avaliar();
        musica1.exibirFicha();


        // Crie uma classe Carro com atributos modelo, ano, cor
        // e métodos para exibir a ficha técnica e calcular a idade do carro.
        Carro carro1 = new Carro();
        carro1.ano = 2020;
        carro1.modelo = "Bugatti Chiron";
        carro1.cor = "prata";
        carro1.calcularIdade(2024);
        carro1.exibirFicha();

        // Crie uma classe Aluno com atributos nome, idade, e um método para exibir informações. Crie uma instância da
        // classe Aluno, atribua valores aos seus atributos e utilize o método para exibir as informações.
        Aluno aluno1 = new Aluno();
        aluno1.preencherInformações();
    }
}
