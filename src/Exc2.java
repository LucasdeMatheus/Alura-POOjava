public class Exc2 {
    public static void main(String[] args) {
        // Utilize métodos getters e setters para acessar e modificar esses atributos.
        IdadePessoa pessoa1 = new IdadePessoa();
        pessoa1.setNome("Lucas");
        pessoa1.setIdade(18);
        pessoa1.verificarIdade();

        // Adicione um método aplicarDesconto que recebe um valor percentual e reduz o preço do produto.
        Produto produto1 = new Produto();
        produto1.setNome("Ferrari");
        produto1.setPreco(50);
        produto1.aplicarDesconto();


        // Adicione um método calcularMedia que retorna a média das notas do aluno.
        Aluno2 aluno1 = new Aluno2();
        aluno1.setNome("Julio");
        aluno1.adicionarNotas(5);
        aluno1.adicionarNotas(10);
        aluno1.adicionarNotas(5.9);
        aluno1.adicionarNotas(9);
        aluno1.calcularMedia();

        // Adicione um método exibirDetalhes que imprime o título e o autor do livro.
        Livro livro1 = new Livro();
        livro1.setTitulo("Attack on Titan");
        livro1.setAutor("Isayama");
        livro1.exibirDetalhes();

    }
}
