package Vendavel;

public class Main {
    public static void main(String[] args) {
        Produto produto = new Produto();
        produto.setNome("Coca-Cola");
        produto.setPreco(7.50);
        produto.setDesconto(0.05);
        produto.setQuantidade(2);
        System.out.println("preço total: "+ produto.calcularPreçoTotal() + "\ncom descoto: " + produto.aplicarDesconto());
    }
}
