package Calculavel;

public class Main {
    public static void main(String[] args) {
        Livro livro = new Livro();
        livro.setDesconto(0.05);
        livro.setPreco(50);

        System.out.println("valor final: " + livro.calcularPrecoFinal());


        ProdutoFisico produto = new ProdutoFisico();
        produto.setPreco(50);
        produto.setJuros(0.05);
        System.out.println("\nvalor final: " + produto.calcularPrecoFinal());
    }
}
