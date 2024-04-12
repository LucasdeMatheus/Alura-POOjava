package Vendavel;

public class Servico implements Vendavel{
    private String nome;
    private int quantidade;
    private double preco;
    private double desconto;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

    @Override
    public double calcularPreçoTotal() {
        return preco * quantidade;
    }

    @Override
    public double aplicarDesconto() {
        return preco - preco * desconto;
    }
}
