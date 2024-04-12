package Calculavel;

public class Livro implements Calculavel {
    double preco;
    double desconto;

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
    public double calcularPrecoFinal() {
        return  preco - preco * desconto ;
    }

}
